package com.gitPractice.org;

import java.util.Scanner;

public class FindLargestOf3Numbers {

	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);
		System.out.println("enter 1st Number");
		int a=sc1.nextInt();
		
		Scanner sc2=new Scanner(System.in);
		System.out.println("enter 2nd Number");
		int b=sc2.nextInt();
		
		Scanner sc3=new Scanner(System.in);
		System.out.println("enter 3rd Number");
		int c=sc3.nextInt();
		
		if(a>b && a>c) {
			System.out.println(a+" is Lagest Number than "+b+","+c);
		}
		else if(b>a && b>c){
			System.out.println(b+" is Largest number than "+a+","+c);
		}
		else {
			System.out.println(c+" is largest Nummber than "+a+","+b);
		}
	}

}
