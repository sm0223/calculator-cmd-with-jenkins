package org.example;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Calculator {

    private static final Logger logger = LogManager.getLogger(Calculator.class);
    public static double sum(double a, double b) {
        logger.info("[SUM] - " + a + ", " +b);
        logger.info("[RESULT - SUM] - " + (a+b));
        return (a+b);
    }
    public static double subtract(double a, double b) {
        logger.info("[SUBTRACT] - " + a + ", " +b);
        logger.info("[RESULT - SUBTRACT] - " + (a-b));
        return (a-b);
    }
    public static double multiply(double a, double b) {
        logger.info("[MULTIPLY] - " + a + ", " +b);
        logger.info("[RESULT - MULTIPLY] - " + (a*b));
        if (b == 0)  return 0;
        return (a*b);
    }
    public static double divide(double a, double b) {
        logger.info("[DIVIDE] - " + a + ", " +b);
        logger.info("[RESULT - DIVIDE] - " + (a+b));
        if (b == 0) throw new ArithmeticException();
        return (a/b);
    }
    public static boolean twoInputs(double ar[]) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("\nEnter Operand 1: ");
            ar[0] = sc.nextDouble();
            System.out.println("\nEnter Operand 2: ");
            ar[1] = sc.nextDouble();
            return true;
        }
        catch (InputMismatchException e) {
            logger.error("[EXCEPTION] - " +e.toString()+ "\n[STACKTRACE] - "+ Arrays.toString(e.getStackTrace()));
            System.out.println("Please enter correct input");
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double inputArray[] = new double[2];
        double a, b;
        char ch= '5';
        while(true) {
            while(true) {
                System.out.println("\nEnter Choice: \n 1. Addition \n 2. Subtraction \n 3. Multiply \n 4. Division \n 5. Exit ");
                ch = (char) sc.nextByte();

                int flag = 1;
                switch (ch) {
                    case 1:
                        if(!twoInputs(inputArray)) break;
                        a = inputArray[0];
                        b = inputArray[1];
                        System.out.println("Sum of the operands = " + sum(a, b));
                        break;
                    case 2:
                        if(!twoInputs(inputArray)) break;
                        a = inputArray[0];
                        b = inputArray[1];
                        System.out.println("Difference of the operands = " + subtract(a, b));
                        break;
                    case 3:
                        if(!twoInputs(inputArray)) break;
                        a = inputArray[0];
                        b = inputArray[1];
                        System.out.println("Multiplication of the Operands = " + multiply(a, b));
                        break;
                    case 4:
                        if(!twoInputs(inputArray)) break;
                        a = inputArray[0];
                        b = inputArray[1];
                        try {
                            System.out.println("Division of the Operands = " + divide(a, b));
                        }catch (ArithmeticException e) {
                            logger.error("[EXCEPTION] - " +e.toString()+ "\n[STACKTRACE] - "+ Arrays.toString(e.getStackTrace()));
                            System.out.println("Division with 0 not allowed");
                        }
                        break;
                    case 5:
                        return;
                    default:
                        flag =0;
                        System.out.println("Please Choose a correct Option");
                }
                if(flag == 1) break;
            }
            System.out.println("\nPress y to continue, anything else to exit");
            ch = sc.next().charAt(0);

            if(ch != 'Y' && ch != 'y') return ;
        }
    }
}