package com.string;

import java.util.Scanner;

public class PallindromeNumber {

	public static void main(String[] args) {
	
		
		
		Scanner sc=new Scanner(System.in);
	System.out.println("enter one value");
	int n=sc.nextInt();
	int org_num=n;
	int rev=0;
	//1.using algorithum
	while(n!=0) {
		
		rev=rev*10+n%10;
		n=n/10;
		}
	if(org_num==rev) {
		System.out.println(org_num+" is pallindrome number");
	}
	else
	{
		System.out.println(org_num+"is not pallindrome number");
		
		}
	}
	
	//2.using string cancatination operator
	
	

}
