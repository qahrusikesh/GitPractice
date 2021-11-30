package com.gitPractice.org;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String word=sc.nextLine();
		String rev="";
		/*
		for(int i=word.length()-1;i>=0;i--) {
			rev=rev+word.charAt(i);
		}*/
		
		//By using character array
		
		char[] a=word.toCharArray();
		int length=a.length;
		
		for(int i=length-1; i>=0;i--) {
			rev=rev+a[i];
		}
		System.out.println(rev);
		
	}

}
