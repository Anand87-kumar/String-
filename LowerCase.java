package com.anand.count;

import java.util.Scanner;

public class LowerCase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Character");
		String str=sc.nextLine();
		int count=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(Character.isLowerCase(ch))
				count++;
		}
		System.out.println(count+"Lower");

	}

}
