package com.slotvinskiy;

//5. Простое число это число которое делится только на себя и на еденицу, например 7.
//Число 2 является самым маленьким простым числом и единственным парным.
//Напишите программу которая определяет, является ли введенное число простым,
//и если нет то выводит его в виде произведения простых множителей: 12 = 2*2*3.

import java.util.Scanner;

public class SimpleDigits {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean isSimpleDigit = isSimple(n);
        if (isSimpleDigit) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    private static boolean isSimple(int n) {
        if (n == 2) {
            return true;
        }
        if (n < 2 || n % 2 == 0) {
            divideOnMultiplies(n);
            return false;
        }
        for (int i = 3; i < n; i += 2) {
            if (n % i == 0) {
                divideOnMultiplies(n);
                return false;
            }
        }
        return true;
    }

    private static void divideOnMultiplies(int n) {
        int divider = 2;
        System.out.print(n + " = ");
        while (n != divider) {
            if (n % divider == 0) {
                n = n / divider;
                System.out.print(divider + "*");
            } else {
                divider++;
            }
        }
        System.out.println(n);
    }
}
