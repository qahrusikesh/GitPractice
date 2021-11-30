package com.gitPractice.org;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number for reverse");
		int number=sc.nextInt();
		
		//1. using Algorithm
		/*
		int rev=0;
		while(number!=0) {
		rev=rev*10+ number%10;
		number=number/10;
		
		}
		
		//By using StringBuffer
		
		StringBuffer sb=new StringBuffer(String.valueOf(number));
		StringBuffer rev=sb.reverse();
		*/
		
		//By using StringBuilder
		
		 StringBuilder sb=new StringBuilder(String.valueOf(number));
		 StringBuilder rev=sb.reverse();
		
		 System.out.println("Reverce number is "+rev);
	}

}
