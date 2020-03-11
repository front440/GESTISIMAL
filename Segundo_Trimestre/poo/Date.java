package poo;

import java.time.Month;

/**
 * Date Class
 * 
 * @author Francisco
 *
 */

public class Date {

  // Attributes
  private int day;
  private int month;
  private int year;

  // Builder
  Date(int d, int m, int y) {
    assert isCorrect(day, month, year): "Construcción de la fecha incorrecta";
    this.day = d;
    this.month = m;
    this.year = y;
  }

  //Modifiers
  public int getDay() {
    return day;
  }

  public void setDay(int day) {
    assert isCorrect(day, this.month, this.year): "Día correcto";
    this.day = day;
  }

  public int getMonth() {
    return month;
  }

  public void setMonth(int month) {
    assert isCorrect(this.day, month, this.year): "Mes correcto";
    this.month = month;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    assert isCorrect(this.day,this. month, year): "Año correcto";
    this.year = year;
  }

  // Formated output
  @Override
  public String toString() {
    return  day + " de " + nameMonth(month) + " de " + year;
  }

  // Method for Date clone
  public Date clone( ) {
    return new Date(this.day, this.month, this.year);
  }

  // Statics methods

  /**
   * In this method return the correct day
   * @param day
   * @param month
   * @param year
   * @return
   */
  public static  boolean isCorrect(int day, int month, int year ) {
    if (year < 0) {
      return false;
    }
    if (month < 1 || month > 12) {
      return false;
    }
    return day > 0 && day <= Date.daysMonth(month, year);

  }

  /**
   * Static method for consult the last day of month
   * @param month
   * @param year
   * @return
   */
  public static int daysMonth(int month, int year) {
    // The last day of month array
    int[] days =  {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    if (Date.leapYear(year)) {
      days[1] = 29;
    }
    return days[month-1];
  }
  /**
   * Static method that return true or false if is correct
   * @param year
   * @return
   */
  public static Boolean leapYear(int year) {
    return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
  }

  public static String nameMonth(int month) {
    String[] months = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
        "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    return months[month-1];

  }

  // Other Methods

  /**
   * In this method add one day to the Date
   * @return
   */
  public Date moreDay() {
    int day = this.day;
    int month = this.month;
    int year = this.year;

    day++;
    if (day > daysMonth(month, year)) {
      day = 1;
      month += 1;
      if (month > 12) {
        month = 1;
        year += 1;
      }
    }
    return new Date(day, month, year);
  }

  /**
   * In this method we remove day to the date
   * @return
   */
  public Date removeDay() {
    int day = this.day;
    int month = this.month;
    int year = this.year;

    day--;
    if (day == 0) {
      month -= 1;
      if (month == 0) {
        month = 12;
        year -= 1;
      }
      day = daysMonth(month, year);
    }
    return new Date(day, month, year);
  }

  /**
   * Method for add n day to Date
   * @param n
   * @return
   */
  public Date addNDay(int n) {
    Date f = this.clone();
    if (n > 0) {
      for (int i = 0; i < n; i++) {
        f = f.moreDay();
      }
    }
    else {
      for (int i = 0; i < Math.abs(n); i++) {
        f = f.removeDay();
      }
    }
    return f; 
  }

  /**
   * Method for remove n day to Date
   * @param n
   * @return
   */
  public Date removeNDay(int n) {
    Date f = this.clone();
    if (n < 0) {
      for (int i = 0; i < Math.abs(n); i++) {
        f = f.moreDay();
      }
    }
    else {
      for (int i = 0; i < Math.abs(n); i++) {
        f = f.removeDay();
      }
    }
    return f;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + day;
    result = prime * result + month;
    result = prime * result + year;
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
    Date other = (Date) obj;
    if (day != other.day)
      return false;
    if (month != other.month)
      return false;
    if (year != other.year)
      return false;
    return true;
  }
  
  /**
   * Method for compare date greater than other
   * @param other
   * @return
   */
  public boolean greaterThan (Date other) {
    if (this.year != other.year) {
      return this.year > other.year;
    }
    else if (this.month != other.month) {
      return this.month > other.month;
    }
    else {
      return this.day > other.day;
    }
  }
  
  /**
   * Method for compare date smaller than other
   * @param other
   * @return
   */
  public boolean smallerThan (Date other) {
    if (this.year != other.year) {
      return this.year < other.year;
    }
    else if (this.month != other.month) {
      return this.month < other.month;
    }
    else {
      return this.day < other.day;
    }
  }
  
  
  
  
}









