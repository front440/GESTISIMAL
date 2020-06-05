package agenda;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import excepciones.CSVInvalidoError;
import segundoTrimestreExamen.CSVInvalidoExeption;
import segundoTrimestreExamen.DatoErroneoExeption;

/**
 * Examen 2ºTrimestre
 * @author Francisco
 *
 */
public class Agenda {

  ArrayList<Contacto> agenda = new ArrayList<Contacto>();

  private static int LIMITECONTACTOS = 100;

  public Agenda() {

  }

  /**
   * Constructor para ficheros CSV
   * @param fichero
   * @throws NumberFormatException
   * @throws DatoErroneoExeption
   * @throws CSVInvalidoExeption
   * @throws LimiteAgendaException
   * @throws ContactoInvalidoException
   */
  @SuppressWarnings("unused")
  public Agenda(String fichero) throws NumberFormatException, DatoErroneoExeption, CSVInvalidoExeption, LimiteAgendaException, ContactoInvalidoException {
    ArrayList<Contacto>  agenda = new ArrayList<Contacto>();
    importarCSV(fichero);
  }

  /**
   * Método que añade a la agenda contactos
   * @param nombre
   * @param telefono
   * @param direccion
   * @param correo
   */
  void annadir(String nombre, String telefono, String direccion, String correo) throws LimiteAgendaException, ContactoInvalidoException {
    try {
      if (agenda.size() > LIMITECONTACTOS) {
        throw new LimiteAgendaException("Límite de la agenda superado");
      }
      agenda.add(new Contacto(nombre, telefono, direccion, correo));

    } catch (ContactoInvalidoException e) {
      throw new ContactoInvalidoException(e.getMessage());
    }
  }

  /**
   * Método que devuelve el índice el contacto con los datos pasados como parámetro
   * @param nombre
   * @return
   * @throws NombreInexistenteException 
   * @throws ContactoInvalidoException 
   */
  private Contacto get(String nombre, String telefono) throws NombreInexistenteException, ContactoInvalidoException {
    try {
      return agenda.get(agenda.indexOf(new Contacto(nombre,telefono)));

    } catch (IndexOutOfBoundsException | ContactoInvalidoException se) {
      throw new NombreInexistenteException("Nombre o teléfono inexistente. ");
    }
  }

  /**
   * Borramos el contacto con el nombre pasado como parámetro
   * @param nombre
   * @return
   * @throws ContactoInvalidoException 
   * @throws NombreInexistenteException 
   */
  boolean borrar(String nombre, String telefono) throws ContactoInvalidoException {
    return agenda.remove(new Contacto(nombre, telefono));
  }

  /**
   * Busca el contacto con los datos pasados como parámetro
   * @param nombre
   * @param telefono
   * @return
   * @throws NombreInexistenteException
   * @throws ContactoInvalidoException 
   */
  Contacto Buscar(String nombre, String telefono) throws NombreInexistenteException, ContactoInvalidoException {
    return get(nombre, telefono);
  }

  @Override
  public String toString() {
    String contacto1 = "" + agenda;
    return contacto1.replace("]", "").replace("[", "").replace(",", "") ;
  }

  /**
   * Método exportador de la agenda
   * @param fichero
   * @throws CSVInvalidoError
   */
  public void exportaCSV(String fichero) throws CSVInvalidoError {

    try {
      BufferedWriter csv = new BufferedWriter(new FileWriter(fichero));

      for (Contacto contacto : agenda) {
        csv.newLine();
        csv.write(  contacto.getNombre() + "," +
            contacto.getTelefono() + "," +
            contacto.getDireccion() + "," +
            contacto.getCorreo());

      }
      csv.close();

    } catch (IOException e) {
      throw new CSVInvalidoError("Error en la escritura del fichero: " + fichero);
    }

  }

  /**
   * Método importador de un fichero CSV al almacén
   * @param fichero
   * @throws NumberFormatException
   * @throws DatoErroneoExeption
   * @throws CSVInvalidoExeption
   * @throws ContactoInvalidoException 
   * @throws LimiteAgendaException 
   */
  public void importarCSV(String fichero) throws NumberFormatException, DatoErroneoExeption, CSVInvalidoExeption, LimiteAgendaException, ContactoInvalidoException {

    try {

      BufferedReader csv = new BufferedReader(new FileReader(fichero));

      String linea = csv.readLine();
      linea = csv.readLine();

      while(linea != null) {
        String[] elementos = linea.split(",");
        annadir(elementos[0], elementos[1], elementos[2], elementos[3]);

        linea = csv.readLine();
      }
      csv.close();
    } catch (IOException  e) {
      throw new CSVInvalidoExeption("No se puede leer el fichero " + fichero);
    }

  }

  /**
   * @return tamaño de la agenda
   */
  int limiteAgenda() {
    return LIMITECONTACTOS;

  }

  /**
   * Método que modifica el tamaño de la agenda
   * @param tamaño
   * @throws LimiteAgendaException
   */
  public void modificaTamanno(int tamaño) throws LimiteAgendaException {
    if (tamaño > 100 && tamaño > agenda.size()) {
      throw new LimiteAgendaException("Tamaño incorrecto");
    }
    LIMITECONTACTOS = tamaño;

  }

  /**
   * @return tamaño de la agenda
   */
  public int verTamañoAgenda() {
    return LIMITECONTACTOS;

  }


}
