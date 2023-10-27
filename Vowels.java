package com.anand.count;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		int vowels =0;
		int nonvowels=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a name: ");
		String str=sc.nextLine();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
			vowels=vowels+1;
		}else {
			nonvowels=nonvowels+1;
		}
		}
		System.out.println("vowels count: "+vowels);
		System.out.println("non vowels count: "+nonvowels);

	}

}
