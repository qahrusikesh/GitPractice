package com.gitPractice.org;

public class RemoveSpecialCharactersInString {

	public static void main(String[] args) {
		String s = "*h_+r_+u#s@i# k><e:s}h{}@1#2$";
		String a = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
		System.out.println(a);

	}
}
