package com.anand.NewString;

import java.util.Scanner;

public class FirstUpperCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character");
		String str=sc.nextLine();
		String digit="";
		String rem="";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(Character.isUpperCase(ch))
				digit=digit+ch;
			else
				rem=rem+ch;
		}
		String sen=digit+rem;
		System.out.print(sen);
	}

}
