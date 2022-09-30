package com.lambdaexpression;

public class Increment {

	public static void main(String[] args) {
		
//		 int a = 5;//6
//	        int b = 2;//3
//	        int c;
//	        int d;
//	        c = ++b;//3 
//	        d = a++; //5
//	        c++;//4 
//	        System.out.println("a = " + a + " b = " + b + " c = " + c + " d = " + d);
		
		int x=1;//1
		int y=--x+x++ +x-- + ++x;//2
		System.out.println(x+"  "+y);
		
	}

}
