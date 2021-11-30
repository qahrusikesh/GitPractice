package com.gitPractice.org;

public class EvenOddNumbersFromAnArray {

	public static void main(String[] args) {
		int a[]= {10,11,20,21,30,31,40,41,50,51};
		
		System.out.println("Even numbers in Array");
		for(int value:a) {
			if(value%2==0) {
				System.out.print(value+",");
			}
		}
		System.out.println();
		System.out.println("Odd numbersin Array");
		for(int value:a) {
			if(value%2!=0) {
				System.out.print(value+",");
			}
		}
	}

}
