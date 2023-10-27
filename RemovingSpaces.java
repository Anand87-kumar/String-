package com.anand.NewString;

import java.util.Scanner;

public class RemovingSpaces {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character");
		String str=sc.nextLine();
		//rem=remove
		String rem= "";
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(!Character.isWhitespace(ch)) {
			rem=rem+ch;
		}
		}
		System.out.print(rem);
	}

}
