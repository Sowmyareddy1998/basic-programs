package com.lambdaexpression;

import java.util.Date;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class RandomDemo {

	public static void main(String[] args) {
		Supplier<String> s=()->{

		String otp = " ";
		for(int i=0;i<6;i++)
		{
			otp=otp+(int)(Math.random()*10);
		}
		return otp;
		};
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		
		Supplier<Date> s1=()->new Date();
		System.out.println(s1.get());
	
		Consumer<String> consumer = (str)-> System.out.println(str.length()+" "+str.toUpperCase());
		consumer.accept("Call Consumer");	


		
		
	}

}
