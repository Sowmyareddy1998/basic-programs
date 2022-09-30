package com.lambdaexpression;

class A implements I2,I1
{

//	@Override
//	public void run() {
//		
//		System.out.println("run");
//	}

	@Override
	public void sleep() {
		
		I2.super.sleep();
	}

	
}



public class D {

	public static void main(String[] args) {
		A a1=new A();
		//a1.run();
		a1.sleep();
	
	

	}

}
