package com.gitPractice.org;

public class SwapTwoNumber {

	public static void main(String[] args) {
		
		int a=10, b=20;
		
		System.out.println("Before swap a= "+a+" and b= "+b);
		
		/*with using 3rd variable
		int temp=0;
		temp=b; //temp=20
		b=a;    //b=10
		a=temp; //a=10
		
		
		//without using 3rd variable
		 */
		a=a+b; //a=10+20=30
		b=a-b; //b=30-20=10
		a=a-b; //a=30-10=20
		
		
		//multiplication and division*/
		a=a*b; //a=10x20=200
		b=a/b; //b=200/20=10  
		a=a/b; //a=200/10=10  
		System.out.println("After swap a= "+a+" and b= "+b);
	}

}
