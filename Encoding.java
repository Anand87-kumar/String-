package com.anand.NewString;

import java.util.Scanner;

public class Encoding {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character");
        String str = sc.nextLine();
        String pl = " ";

        // Find the position of the first vowel in the word
        int firstVowelIndex = -1;
        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toUpperCase(str.charAt(i));
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                firstVowelIndex = i;
                break;
            }
        }

        if (firstVowelIndex == 0) {
            // If the first letter is a vowel, simply add "WAY" to the end
            pl = str + "WAY";
        } else if (firstVowelIndex > 0) {
            // If the first vowel is not the first letter, create Pig Latin word
            pl = str.substring(firstVowelIndex) + str.substring(0, firstVowelIndex) + "AY";
        }

        System.out.print(pl);
    }
}

