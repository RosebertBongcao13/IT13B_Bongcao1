/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Midterm;

/**
 *
 * @author PC
 */
import java.util.Scanner;

public class Bongcao_SimpleCalculatorUsingMethods {

   public static double calculate(double a, double b, char op) {
       return switch (op) {
           case '+' -> a + b;
           case '-' -> a - b;
           case '*' -> a * b;
           case '/' -> (b != 0) ? a / b : 0;
           default -> 0;
       };
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        System.out.println("Result: " + calculate(num1, num2, operator));
        scanner.close();
    }
}

