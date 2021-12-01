package com.gitPractice.org;

public class FindDuplicateElementsInArray {

	public static void main(String[] args) {
		String[] language = { "java", "c", "c#", "python", "java" };
		boolean flag = false;
		for (int i = 0; i < language.length; i++) {
			for (int j = i + 1; j < language.length; j++) {
				if (language[i] == language[j]) {
					System.out.println("Duplicate Elements in array is " + language[i] + ",");
					flag = true;
				}

			}

		}
		if (flag == false) {
			System.out.println("Duplicate Elements not found");
		}

	}

}
