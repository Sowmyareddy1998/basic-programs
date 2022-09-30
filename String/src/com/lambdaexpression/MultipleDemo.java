package com.lambdaexpression;
	
	

public class MultipleDemo  implements I1,I2{

	public static void main(String[] args) {
	
		MultipleDemo i=new MultipleDemo();
		i.sleep();
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("jiiiiii");
		I2.super.sleep();
	}
	

//	@Override
//	public void run() {
//		System.out.println("hello sowmya");
//		
//	}

}
