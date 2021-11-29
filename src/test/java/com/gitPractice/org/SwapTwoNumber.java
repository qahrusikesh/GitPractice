package com.gitPractice.org;

public class SwapTwoNumber {

	public static void main(String[] args) {
		
		int a=10, b=20;
		
		System.out.println("Before swap a= "+a+" and b= "+b);
		
		/*with using 3rd variable
		int temp=0;
		temp=b;
		b=a;
		a=temp;
		
		
		//without using 3rd variable
		a=a+b;
		b=a-b;
		a=a-b;*/
		
		//multiplication and division
		
		a=a*b;//200
		System.out.println(a);
		b=a/b;    //200/20=10
		System.out.println(b);
		a=a/b;   //200/10=20
		System.out.println(a);
	
		System.out.println("After swap a= "+a+" and b= "+b);
	}

}
