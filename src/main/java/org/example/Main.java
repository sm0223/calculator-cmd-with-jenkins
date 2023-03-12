package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Operand 1");
        double a = sc.nextDouble();
        System.out.println("Enter Operand 2");
        double b = sc.nextDouble();
        System.out.println("\nEnter Choice: \n 1. Addition \n 2. Subtraction");
        char ch = (char)sc.nextByte();
        switch (ch) {
            case 1:
                System.out.println("Sum of the operands = " + (a + b));
                break;
            case 2:
                System.out.println("Difference of the operands = " + (a - b));
                break;
        }


    }
}