package com.gitPractice.org;

import java.util.Scanner;

public class CountDigitInNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number for count");
		int number=sc.nextInt();
		int count=0;
		 while(number!=0) {
			 number=number/10;
			 count++;
		 }
		 System.out.println(" is a "+count+ " digit number");
	}

}
