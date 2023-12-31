package org.example;

import java.util.Scanner;

public class Celsius {

    public Celsius() {
        float celsius = 0.0F;
        float feh = 0.0F;
        Scanner scan = new Scanner(System.in);

        System.out.println("1 - Celsius to Fahrenait ");
        System.out.println("* - Fahrenait to Celsius ");

        byte conv = scan.nextByte();
        System.out.println("Celsius: ");

        if( conv == 1 ) {

            celsius = scan.nextFloat();
            feh = c2f(celsius);
            System.out.format("Fahrenait of %.2f Celsius => %.2f \n", celsius, feh);

        } else {

            feh = scan.nextFloat();
            celsius = f2c(feh);
            System.out.format("Celcsius of %.2f Fahrenait => %.2f \n", feh, celsius);
        }
    }

    public float c2f (float celsius) {
        return (float) 9.0/5 * celsius + 32;
    }

    public float f2c (float celsius) {
        return (float) ((feh - 32) * 5.0/9);
    }

    public static void main(String args[]) {
        Celsius obj = new Celsius();
    }

}
