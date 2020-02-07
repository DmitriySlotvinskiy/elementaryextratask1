package com.slotvinskiy;

//5.1. Вывести n-ное простое число. Например для n=5, результатом будет 11. (2, 3, 5, 7, 11)

import java.util.Scanner;

public class SimpleDigitFinder {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n < 2) {
            throw new NumberFormatException("number should be >= 2");
        }
        if (n == 2) {
            System.out.println("(2)");
        } else {
            System.out.print("(2");
            int counter = 1;
            for (int i = 3; counter < n; i++) {
                if (isSimple(i)) {
                    System.out.print(", " + i);
                    counter++;
                }
            }
            System.out.println(")");
        }
    }

    private static boolean isSimple(int n) {
        if (n == 2) {
            return true;
        }
        if (n < 2 || n % 2 == 0) {
            return false;
        }
        for (int i = 3; i < n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
