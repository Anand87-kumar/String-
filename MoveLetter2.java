package com.anand.NewString;

import java.util.Scanner;

public class MoveLetter2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character");
        String str = sc.nextLine();
        String enc = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'Y' || ch == 'Z' || ch == 'y' || ch == 'z') {
                ch -= 24; // Shift Y or Z by 2 positions to get A or B
            } else if (Character.isLetter(ch)) {
                ch += 2; // Shift other letters by 2 positions in the alphabet
            }
            enc = enc + ch;
        }
        System.out.print(enc);
    }
}

