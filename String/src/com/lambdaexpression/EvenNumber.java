package com.lambdaexpression;

public class EvenNumber {

	public static void main(String[] args) {
		Functional fi=(n)->{
			
			for(int i=2;i<=n;i++) {
				
				if(i%2==0)
					System.out.print("  "+i);
				else
					System.out.println("  "+i);
				
			}
			
		};
		fi.even(20);
	}

}
interface Functional
{
	public void even(int n);
}
