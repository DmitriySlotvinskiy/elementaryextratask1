package com.slotvinskiy;

import java.util.Scanner;

public class Square {

    public static final Scanner SCANNER = new Scanner(System.in);
    public static final double ACCURACY = 0.00000000000001;

    public static void main(String[] args) {

        int x = SCANNER.nextInt();
        double y = findSquare(x);
        System.out.println(y);
    }

    private static double findSquare(int x) {
        if (x == 0) {
            return x;
        }
        if (x < 0) {
            throw new NumberFormatException("number should be positive!");
        }
        double start = 1;
        double end = x;
        double solution = start + ((end - start) / 2.0);
        while (solution * solution - x != 0) {
            if (solution * solution - x > 0) {//слишком большлой, нужно уменшьшить
                if (end == solution) {
                    break;//достигнута максимальная точность
                }
                end = solution;
            } else {
                if (start == solution) {
                    break;//достигнута максимальная точность
                }
                start = solution;//слишком маленький, нужно увеличить
            }
            solution = start + ((end - start) / 2.0);
        }
        return solution;
    }
}
