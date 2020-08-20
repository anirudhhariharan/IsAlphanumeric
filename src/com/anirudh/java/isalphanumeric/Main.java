package com.anirudh.java.isalphanumeric;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = in.nextLine();
		int length = str.length();
		
		for(int i = 0; i < length; i++) {
			char ch = str.charAt(i);
			
			if(!(((ch >= 'a') && (ch <= 'z')) || ((ch >= 'A' ) && (ch <= 'Z')) || ((ch >= '0') && (ch <= '9')))) {
				System.out.println("It is not alphnumeric");
				System.exit(0);
			}
			
		}
		
		System.out.println("It is alphanumeric");

	}

}
