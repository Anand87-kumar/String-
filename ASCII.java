package com.anand;

import java.util.Scanner;

public class ASCII {

	public static void main(String[] args) {
		

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the character");
		String str = sc.nextLine();
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			System.out.println(ch+" "+(int)ch);
		}
	}

}
