package com.lambdaexpression;

public class swapping {

	public static void main(String[] args) {
	
		Interchange f=(a,b)-> {
		
			System.out.println("before swapping:"+ "a:"+a+" b:"+b );
		
		b=a+b-(a=b);
			System.out.println("after swapping:"+ "a:"+a+" b:"+b );
		};
		f.swap(10,20);
	}

}
interface Interchange
{
	public void swap(int a,int b);
	
}
