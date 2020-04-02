package colecciones;

import java.util.ArrayList;
import java.util.Arrays;
/**
 * 
 * @author Francisco
 * 
 * Clase Carta: Esta clase creará aleatoriamente un carta de la baraja española.
 *
 */

public class Carta {
  
//Variable estáticas que almacenan los valores de las cartas
  String[] n = {"as","dos","tres","cuatro","cinco","seis","siete","sota","caballo","rey"};
  String[] p = {"oros","espadas","copas","bastos"};
  
  
  // Atributos
  String numero;
  String palo;
  
  // Constructor
 Carta() {
    this.numero = n[(int)(Math.random()*n.length)];
    this.palo = p[(int)(Math.random()*p.length)];
  }

  // Modificadores
  public String getNumero() {
    return numero;
  }

  public void setNumero(String numero) {
    this.numero = numero;
  }

  public String getPalo() {
    return palo;
  }

  public void setPalo(String palo) {
    this.palo = palo;
   
  }

  // Salida formateada
  @Override
  public String toString() {
    return numero + " de " + palo;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + Arrays.hashCode(n);
    result = prime * result + ((numero == null) ? 0 : numero.hashCode());
    result = prime * result + Arrays.hashCode(p);
    result = prime * result + ((palo == null) ? 0 : palo.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Carta other = (Carta) obj;
    if (!Arrays.equals(n, other.n))
      return false;
    if (numero == null) {
      if (other.numero != null)
        return false;
    } else if (!numero.equals(other.numero))
      return false;
    if (!Arrays.equals(p, other.p))
      return false;
    if (palo == null) {
      if (other.palo != null)
        return false;
    } else if (!palo.equals(other.palo))
      return false;
    return true;
  }

 
 
  

}
