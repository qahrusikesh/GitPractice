package com.gitPractice.org;

import java.util.Scanner;

public class CountSumOfDigitsInANumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int number=sc.nextInt();
		int sum=0;
		while(number!=0) {
		sum=sum+number%10;
		number=number/10;
		}
		System.out.println("sum of all digit of the number is "+sum);

	}

}
