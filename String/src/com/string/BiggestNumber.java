package com.string;

public class BiggestNumber {

	public static void main(String[] args) {
	
	int a[]= {8,7,6,5,4,3,2,1};
	
	int temp=0;
	
	for(int i=0;i<a.length;i++) {
		for(int j=1+i;j<a.length;j++) {
			
			if(a[i]>a[j]) {
				
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				System.out.print(" "+a[i]);
			}
		}
		System.out.print(" "+a[i]);
	}
		
		
		}

	}


