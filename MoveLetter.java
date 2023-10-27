package com.anand.NewString;

import java.util.Scanner;

public class MoveLetter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String input = scanner.nextLine();

        String encodedWord = encodeWord(input);
        System.out.println("Encoded word: " + encodedWord);
    }

    public static String encodeWord(String word) {
        StringBuilder encoded = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            char originalChar = word.charAt(i);
            char encodedChar;

            if (Character.isLetter(originalChar)) {
                char base = Character.isLowerCase(originalChar) ? 'a' : 'A';
                encodedChar = (char) (base + (originalChar - base + 2) % 26);
            } else {
                encodedChar = originalChar;
            }

            encoded.append(encodedChar);
        }

        return encoded.toString();
    }
}

