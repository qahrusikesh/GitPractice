package com.gitPractice.org;

import java.util.Scanner;

public class PalindropNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number for palindrom verification");
		int number=sc.nextInt();
		int org_number=number;
	
		
		int rev=0;
		while(number!=0) {
		rev=rev*10+ number%10;
		number=number/10;
		
		}
		if(org_number==rev) {
			System.out.println(org_number+" is a Palindrom Number");
		}
		else {
			System.out.println(org_number+" is not a Palindrom ");
		}
		


	}

}
