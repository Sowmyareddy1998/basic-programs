package com.string;

import java.util.Scanner;

public class CountNoOfWords {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter one value");
		String str=sc.nextLine();
		//String str="lancesoft india";
	int l=str.length();
		System.out.println(l);
		int count = 1;
	//1.Algorithm
		for(int i=0;i<l-1;i++) {
			
		if((str.charAt(i)==' ') && (str.charAt(i+1)!=' ')) {
			
			count++;
				}
			}
		System.out.println(count);
		
		
		
		}

	}


