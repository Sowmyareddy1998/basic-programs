package com.string;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
	
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter one value");
		int n=s.nextInt();
		int rev = 0;
		//1.using algorithum
		while(n!=0)
		{
			rev =rev*10+n%10;
			n=n/10;
		
			
		}
		System.out.println(rev);
//		
		
		//2.using stringbuffer cls
		
		
		StringBuffer sb=new StringBuffer(String.valueOf(n));
		 StringBuffer s1=sb.reverse();
		System.out.println(s1);
		
	//	3.using stringbuffer cls
		
		StringBuffer sb1=new StringBuffer();
		sb1.append(n);
		StringBuffer stb=sb1.reverse();
		System.out.println(stb);
		
		
		

	}

}
