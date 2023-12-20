package org.example;

import java.util.Scanner;

public class MonChar {
    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);

        String s = scan.next();

        char monChar = s.charAt(0);

        System.out.println(monChar);
    }
}
