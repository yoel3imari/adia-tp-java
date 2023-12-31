package org.example;

import java.util.Scanner;

public class Saisie {
    public static  void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Donner votre age: ");
        byte age = scan.nextByte();
        age += 50;
        String result = Byte.toString(age);
        System.out.println("après 50ans vous aurez " + result+ " and");
    }
}
