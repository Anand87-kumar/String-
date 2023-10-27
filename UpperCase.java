package com.anand.NewString;

import java.util.Scanner;

public class UpperCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Character");
		String str=sc.nextLine();
		String sn="";

		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(Character.isUpperCase(ch))
			sn=sn+ch;
		}
		System.out.println(sn);

	}

}
