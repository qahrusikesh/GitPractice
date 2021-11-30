package com.gitPractice.org;

import java.util.Scanner;

public class CountNumberOfEvenOddDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int number=sc.nextInt();
		int even_count=0;
		int odd_count=0;
		int temp=0;
		while(number!=0) {
			temp=temp*10+ number%10;
		if(temp%2==0) {
			even_count++;
		}
		else {
			odd_count++;
		}
		number=number/10;
		
		}
		System.out.println("Even numbers in number is "+even_count++);
		System.out.println("Odd numbers in number is "+odd_count++);

	}

}
