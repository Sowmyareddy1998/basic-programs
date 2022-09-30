package com.lambdaexpression;

abstract class Inner
{
	abstract void eat();
      void run() {
    	  System.out.println("run");
      }
}

public class AnonymousInner {

	public static void main(String[] args) {
		
		Inner a=new Inner() {

			@Override
			void eat() {
				System.out.println("hello");
			}
            };
		a.eat();
		a.run();
		}
	
	

}
