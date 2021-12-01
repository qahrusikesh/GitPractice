package com.gitPractice.org;

public class FindMaximumMinimumValuesInArray {

	public static void main(String[] args) {
		// find Maximum number in Array
		int a[] = { 50, 20, 10, 30, 70, 40 };
		int max = a[0];

		for (int i = 1; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];

			}
		}
		System.out.println("maximun number in this Array is " + max);

		// find Maximum number in Array
		int b[] = { 30, 50, 60, 20, 40 };
		int min = b[0];
		for (int i = 1; i < b.length; i++) {
			if (b[i] <min) {
				min = b[i];
			}
		}
		System.out.println("minimum number in this Array  is " + min);

	}

}
