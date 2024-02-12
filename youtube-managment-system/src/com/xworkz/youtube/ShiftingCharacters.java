package com.xworkz.youtube;

import java.util.Scanner;

public class ShiftingCharacters {
    String givenCharacters;
        public static void main(String[] args) {

            String swappedString = swapCase("XWorkZ");

            System.out.println("Swapped String is " + swappedString);
        }

        private static String swapCase(String givenCharacters) {
            char[] chars = givenCharacters.toCharArray();

            for (int i = 0; i < chars.length; i++) {
                char currentChar = chars[i];
                if (currentChar >= 'A' && currentChar <= 'Z') {
                    chars[i] = (char) (currentChar + 32);
                } else if (currentChar >= 'a' && currentChar <= 'z') {
                    chars[i] = (char) (currentChar - 32);
                }
            }
            return new String(chars);
        }
    }


