package com.anand.NewString;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character");
		String str=sc.nextLine();
		String rev="";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			rev=ch+rev;
			
		}
		if(str.equalsIgnoreCase(rev))
		     System.out.print("Palindrome");
		else
			System.out.print("Not Palindrome");

	}

}
