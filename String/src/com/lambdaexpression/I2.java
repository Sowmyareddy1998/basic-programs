package com.lambdaexpression;

public interface I2 {

	//void run();
    default void sleep() {
		System.out.println("i2");
	}

}
