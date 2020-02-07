package com.slotvinskiy;

//3. Не используя методы String - contains, indexOf,  lastIndexOf,  split, substring,
// регулярные выражения, итд определить входит ли подстрока в строку.
//        (можно использовать методы toCharArray(), charAt())


public class Substring {
    public static void main(String[] args) {

        String text = "Everyone knows that a bat is not a bird. The bats are mammal. A bat’s wings are featherless";
        String subString = "bat";
        boolean isStringInText = isSubstring(text, subString);
        if (isStringInText) {
            System.out.println("There is \"bat\" in string");
        } else {
            System.out.println("There is not \"bat\" in string");
        }
        //        4.1. Найти все вхождения подстроки в строку аналогичным способом.
        int numOfCoincidences = numOfSubstrings(text, subString);
        System.out.println("Number of coincidences is: " + numOfCoincidences);

    }


    private static boolean isSubstring(String text, String subString) {
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == subString.charAt(0)) {
                for (int j = 1; j < subString.length() && text.charAt(i + j) == subString.charAt(j); j++) {
                    if (subString.length() - 1 == j) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static int numOfSubstrings(String text, String subString) {
        int counter = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == subString.charAt(0)) {
                for (int j = 1; j < subString.length() && text.charAt(i + j) == subString.charAt(j); j++) {
                    if (subString.length() - 1 == j) {
                        counter++;
                        i += j;
                        break;
                    }
                }
            }
        }
        return counter;
    }
}
