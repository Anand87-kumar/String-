package com.anand.NewString;

import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character");
        String str = sc.nextLine();
        String rev = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                rev = rev + Character.toLowerCase(ch);
            } else {
                rev = rev + Character.toUpperCase(ch);
            }
        }
        System.out.print(rev);
    }

}

