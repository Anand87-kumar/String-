package com.anand;

import java.util.Scanner;

public class SeparateLine {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence");
		String s=sc.nextLine();
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			System.out.println(ch);
		}

	}

}
