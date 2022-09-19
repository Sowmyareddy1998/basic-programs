package com.string;

public class SwappingExample {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		//System.out.println(a+" "+b);
		
		//1.using third variable
		int t;
		t=a; //t=10
	    a=b; //a=20
		b=t; //b=10
		
		//System.out.println(a+" "+b);
		//2.without using third variable
		
		a=a+b; //a=30
		b=a-b; //b=10
		a=a-b; //a=20
		//System.out.println(a+"  "+b);
		
		//3.using multiplication and division operator
		
		a=a*b; //a=200
		b=a/b; //b=10
		a=a/b; //a=20
		//System.out.println(a+" "+b);
		
		//4.using XOR operator(if both values are equal then it is 1 otherwise 0 )
		
		a=a^b; // 10^20=30
		b=a^b;//  30^20=10 
		a=a^b; //30^10=20
		
		//5.single stmt
		
		b=a+b-(a=b);
		System.out.println(a+" "+b);
		
		
		
		
		
		
		
		
		
		

	}

}
