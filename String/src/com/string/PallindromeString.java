package com.string;

import java.util.Scanner;

public class PallindromeString {

	public static void main(String[] args) {

Scanner sc=new Scanner(System.in);
System.out.println("enter string value");
String str=sc.next();
System.out.println(str);
 int l=str.length();
 String org_str=str;
 String rev="";
 for(int i=l-1;i>=0;i--)
 {
	 rev=rev+str.charAt(i);
	 //System.out.println(rev);
	 
 }
 if(org_str.equals(rev))  
	 System.out.println(org_str+" is pallindrome string");
 else
	 System.out.println(org_str+" is not pallindrome string");
	}

}
