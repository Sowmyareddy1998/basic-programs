package com.string;

import java.util.Scanner;

public class NumberOfDegits {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter one value");
		int n=sc.nextInt();
		int count = 0;
		while(n!=0) {
			 n=n/10;//n=123,n=123/10=3,12/10=2,2/10=0
			 count++;//count=1,2,3
			 }
			System.out.println(count);
			
			
		}

	}


