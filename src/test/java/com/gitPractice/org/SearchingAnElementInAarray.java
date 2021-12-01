package com.gitPractice.org;

import java.util.Scanner;

public class SearchingAnElementInAarray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type a single digit number to Search");
		int num = sc.nextInt();
		int[] number = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
		boolean flag = false;
		for (int i = 0; i < number.length; i++) {
			if (num == number[i]) {
				System.out.println("Searched element is " + number[i]);
				flag = true;
				break;
			}

		}
		if (flag == false) {
			System.out.println(num + " is not available in this Array");
		}

	}

}
