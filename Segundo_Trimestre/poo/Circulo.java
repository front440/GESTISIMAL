package poo;

import javax.swing.JOptionPane;

import excepciones.RadioNegativoError;

public class Circulo {

  // creamos los atributos

  private double radio;

  // creamos el constructor

  public Circulo(double radio) throws RadioNegativoError {
    setRadio(radio);
  }  

  // getters y setters
  public double getRadio() {
    return radio;
  }

  public void setRadio(double radio) throws RadioNegativoError {
    if (radioCorrecto(radio)) {
      this.radio = radio;
    }
    else {
      throw new RadioNegativoError("Radio negativo");
    }
  }

  // Metodos

  /**
   * M�todo para mostrar el radio del circulo
   */

  @Override
  public String toString() {
    return "Soy un circulo de radio " + this.getRadio() + " metros. Ocupo un �rea de " + this.area() + " metros cuadrados";
  }

  /**
   * Comprueba el si el radio es correcto.
   * @param radio
   * @return true o false
   */
  public boolean radioCorrecto(double radio) {
    if (radio < 0 ) {
      return false;
    }
    else {
      return true;
    }
  }

  /**
   * M�todo para  aumentar su radio
   * @param tamanio
   * @return
   */

  public double crece(double tamanio) {
    if(this.radio < 0) {
      System.out.println("El radio no puede ser negativo");
      System.exit(1);

    }else if (this.radio == 0) {
      JOptionPane.showMessageDialog(null, "Soy un m�sero punto sin �rea");
    }


    return this.radio = radio * tamanio;

  }


  /**
   * M�todo para decrementar su radio.
   * @param tamanio
   * @return
   */

  public double mengua(double tamanio) {
    if(this.radio < 0) {
      System.out.println("El radio no puede ser negativo");
      System.exit(1);

    }else if (this.radio == 0) {
      JOptionPane.showMessageDialog(null, "Soy un m�sero punto sin �rea");
    }


    return this.radio = radio - tamanio;

  }

  /**
   * M�todo para calcular el �rea del circulo
   * @return
   */

  public double  area() {
    return Math.PI * Math.pow(this.radio, 2);
  }

}
