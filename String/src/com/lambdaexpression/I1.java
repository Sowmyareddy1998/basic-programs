package com.lambdaexpression;

public interface I1 {
	
	
		//void run();
		default void sleep() {
			System.out.println("i1");
		}

}
