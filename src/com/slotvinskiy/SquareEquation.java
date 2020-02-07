package com.slotvinskiy;

//Напишите программу, которая решает квадратное уравнение вида a*x*x + b*x + c = 0, где заданы a, b, c.

import java.util.Scanner;

public class SquareEquation {

    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        int a = SCANNER.nextInt();
        int b = SCANNER.nextInt();
        int c = SCANNER.nextInt();
        double d = b * b - 4 * a * c;
        if (d > 0) {
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.printf("There are two roots: x1=%s and x2=%s\n", x1, x2);
        } else if (d == 0) {
            double x = -b / (2.0 * a);
            System.out.printf("There is only one root: x=%s\n", x);
        } else {
            System.out.println("There isn't any roots");
        }
    }
}
