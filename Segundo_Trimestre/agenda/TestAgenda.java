package agenda;

import excepciones.CSVInvalidoError;
import segundoTrimestreExamen.CSVInvalidoExeption;
import segundoTrimestreExamen.DatoErroneoExeption;
import utiles.Menu;
import utiles.Teclado;

/**
 * Examen 2ºTrimestre
 * @author Francisco
 *
 */
public class TestAgenda {

  static Agenda agenda = new Agenda();

  static Menu menu = new Menu("Agenda de Contatos", new String[] {
      "Añadir Contacto", "Borrar Contacto", "Buscar Contacto","Mostrar agenda",
      "Exporta CSV", "Importa CSV", "Modifica Tamaño", "Ver Tamaño de Agenda", "Salir"});


  public static void main(String[] args) {

    //annadirVarios();

    do {
      switch (menu.gestionar()) { 
      case 1:
        añadeContacto();
        break;
      case 2:
        borraContacto();
        break;
      case 3:
        buscaContacto();
        break;
      case 4:        
        System.out.println(agenda);
        break;
      case 5:        
        exportaCSV();
        break;
      case 6:        
        importaCSV();
        break;
      case 7:        
        modificaTamaño();
        break;
      case 8:        
        verTamañoAgenda();
        break;
      case 9:        
        System.out.println("Has salido del menú");
        System.out.println("¡Hasta la próxima!");
        System.exit(200);
      default:
        System.err.println("Solo existen opciones entre 1 y 4.");
        System.out.println("--------------------------------------");
      }

    } while (true);
  }


  //  /**
  //   * Añadimos varios contactos a la agenda
  //   */
  //  private static void annadirVarios() {
  //    agenda.annadir("Francisco Javier", "628191877", "Arcos de la Frontera", "calidad@gmail.com");
  //    agenda.annadir("Pepito ", "628191877", "Asuncion", "calidad@gmail.com");
  //    agenda.annadir("Rafael", "789654123", "Enrique Lovera", "rdelcastillo@gmail.com");
  //    agenda.annadir("Lourdes Magarin", "654123698", "Pedro Crespo", "lourdes@gmail.com");
  //    agenda.annadir("Jose Luis", "789654123", "Lo que sea", "JLAF@gmail.com");
  //
  //  }


  /**
   * Invocador de del método de añadir contacto
   */
  private static void añadeContacto() {

    try {
      agenda.annadir( Teclado.getTexto("Introduce el nombre: "),
          Teclado.getTexto("Introduce el teléfono: "), 
          Teclado.getTexto("Introduce el dirección: "), 
          Teclado.getTexto("Introduce el e-mail: "));
    } catch (LimiteAgendaException e) {
      System.err.println(e.getMessage());
    } catch (ContactoInvalidoException e) {
      System.err.println("");
    }


  }

  /**
   * Invocador del método borrar contacto
   */
  private static void borraContacto() {
    try {
      if (!agenda.borrar( Teclado.getTexto("Introduce el nombre que desee borrar: "),
          Teclado.getTexto("Introduce el teléfono del contacto que desee borrar: ")))
        System.err.println("Nombre inexistente");
    } catch (ContactoInvalidoException e) {
      System.err.println(e.getMessage());
    }

  }

  /**
   * Invocador del método busca contacto
   */
  private static void buscaContacto() {
    try {
      System.out.println(agenda.Buscar( Teclado.getTexto("Introduce el nombre que desee buscar: "),
          Teclado.getTexto("Introduce el teléfono del contacto que desee buscar: ")));
    } catch (NombreInexistenteException | ContactoInvalidoException e) {
      System.err.println(e.getMessage());
    } 

  }

  /**
   * Invocador del método exportaCSV
   */
  private static void exportaCSV() {
    try {
      agenda.exportaCSV(Teclado.getTexto("Introduce el nombre del fichero: "));
    } catch (CSVInvalidoError e) {
      System.err.println(e.getMessage());
    }

  }

  /**
   * Invocador del método importaCSV
   */
  private static void importaCSV() {

    try {
      agenda.importarCSV(Teclado.getTexto("Introduce el nombre del fichero: "));
    } catch (LimiteAgendaException | ContactoInvalidoException | NumberFormatException | DatoErroneoExeption | CSVInvalidoExeption e) {
      System.err.println(e.getMessage());
    }

  }

  /**
   * Invocador del método modificaTamaño
   */
  private static void modificaTamaño() {

    try {
      agenda.modificaTamanno(Teclado.getEntero("Introduce el nuevo tamaño de la agenda: "));
    } catch (LimiteAgendaException e) {
      System.err.println(e.getMessage());
    }
  }

  /**
   * Invocador del método verTamañoAgenda
   */
  private static void verTamañoAgenda() {
    System.out.println(agenda.verTamañoAgenda());

  }


}