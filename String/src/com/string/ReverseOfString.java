package com.string;

public class ReverseOfString {
//reverse string of given value
	public static void main(String[] args) {
		
		
//1.using +(string cancatination) operator
		String str="abcd";
		String rev="";
		int l=str.length();
	System.out.println(l);
	
		for(int i=l-1;i>=0;i--) {
			
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
//2. using toCharArray()
		
		char[] r=str.toCharArray();
		System.out.println(r);
		int l1=r.length;
		System.out.println(l1);
		
		for(int i=l1-1;i>=0;i--) {
		
		rev=rev+r[i];

	}
		System.out.println(rev);
		
		
//3.  using stringbuffer cls
		
	StringBuffer sb=new StringBuffer(str);
	 StringBuffer s=sb.reverse();
	 System.out.println(s);
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}

