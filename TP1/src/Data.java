package org.example;

/**
 * Overload
 */
public class Data {

  static void draw (String s) {
    System.out.println("Ceci est une chaîne " + s);
  }

  static void draw (int i) {
    System.out.println("Ceci est un entier " + i);
  }

  static void draw (double f) {
    System.out.println("Maintenant un double " + f);
  }

  static void draw (int i, double f) {
    System.out.format("Une entier %d et un double %f", i, f );
  }

  public static void main (String[] args) {
    Data.draw(0);
    Data.draw("hello");
    Data.draw(9.5);
    Data.draw(0, 0);
  }
}