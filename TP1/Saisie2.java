package org.example;

import java.util.Scanner;

public class Saisie2 {
    public static  void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int age;
        String name;
        double height;

        System.out.println("Votre nom: ");
        name = scan.nextLine();

        System.out.println("Votre age: ");
        age = scan.nextInt();

        System.out.println("Votre taille: ");
        height = scan.nextDouble();

        System.out.println("Nom: " + name);
        System.out.println("Age: " + age);
        System.out.println("Taille: " + height);

        System.out.format("Nom: %s \n Age: %d \n Taille: %.2f\n",name, age, height );


    }
}
