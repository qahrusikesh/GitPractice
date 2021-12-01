package com.gitPractice.org;

import java.util.Arrays;

public class CheckTheEqualityOfTwoArrays {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int b[]= {2,3,4,5,6};
		 boolean status=Arrays.equals(a, b);
		 if(status==true) {
			 System.out.println(a+" and "+b+" are same");
		 }
		 else {
			 System.out.println(a+" and "+b+" are Not same");
		 }
	}

}
