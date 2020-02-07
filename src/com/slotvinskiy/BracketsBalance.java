package com.slotvinskiy;

//6. Баланс скобок. Дана конечная последовательность, состоящая из левых и правых скобок различных заданных типов.
//Определить, можно ли добавить в нее цифры и знаки арифметических действий так,
// чтобы получилось правильное арифметическое выражение.
//Примеры:
//1 ( NO
//2 )) NO
//3 [} NO
//4 {} YES
//5 (){}[] YES
//6 ({[]}{}) YES
//7 [({}())[] NO

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class BracketsBalance {

    public static void main(String[] args) {

        Deque<Character> brackets = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        if (isBracketsBalance(brackets, string)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    private static boolean isBracketsBalance(Deque<Character> brackets, String string) {
        for (int i = 0; i < string.length(); i++) {
            char currentCh = string.charAt(i);
            if (i == 0 && (currentCh == ')' || currentCh == '}' || currentCh == ']')) {
                brackets.add(currentCh);
                break;
            }
            if (currentCh == '(' || currentCh == '{' || currentCh == '[') {
                brackets.push(currentCh);
                continue;
            } else if (brackets.isEmpty()) {
                brackets.add(currentCh);
                break;
            } else if (currentCh == ')' && brackets.peek() == '(') {
                brackets.pop();
                continue;
            } else if (currentCh == '}' && brackets.peek() == '{') {
                brackets.pop();
                continue;
            } else if (currentCh == ']' && brackets.peek() == '[') {
                brackets.pop();
                continue;
            }
        }
        if (string.length() == 0) {
            System.out.println("Empty input");
            return false;
        } else if (brackets.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}
