package com.lambdaexpression;



public class Demo {

	public static void main(String[] args) {
	
		FunctionalInterface  fi=( a,b)->System.out.println(a+b);
		fi.add(10,20);
		fi.add(100,200);
		
		FunctionalInterface fi1=(a,b)->System.out.println(a-b);
		fi1.add(10,20);
		fi1.add(100,200);
	
}
	
	

}
interface FunctionalInterface
{
	public void add(int a,int b);
}
