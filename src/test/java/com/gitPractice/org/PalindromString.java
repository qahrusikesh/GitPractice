package com.gitPractice.org;

import java.util.Scanner;

public class PalindromString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String word=sc.nextLine();
		String rev="";
		String original_word=word;
		for(int i=word.length()-1;i>=0;i--) {
			rev=rev+word.charAt(i);
		}
		System.out.println(rev);
		if(rev.equals(original_word)) {
			System.out.println(word+" is a palindrom String ");
		}
		else {
			System.out.println(word+" is not a Palindrom String");
		}

	}

}
