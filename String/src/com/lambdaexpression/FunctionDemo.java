package com.lambdaexpression;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

class  Student
{
	
	String name;
	int marks;
	public Student(String name, int i) {
		super();
		this.name = name;
		this.marks = i;
	}
}

public class FunctionDemo {

	public static void main(String[] args) {
		
	Function<Student,String> p=(Student e)-> e.name+ " "+e.marks;
	List<Student> l=new ArrayList<>();
	l.add(new Student("srimukhi", 10));
	l.add(new Student("ravi", 20));
	l.add(new Student("lasya", 10));
	l.add(new Student("anasuya", 50));
	l.add(new Student("pradeep", 50));
	l.add(new Student("suma", 100));
	Predicate<Student> p1=e1->e1.marks>40;
	Predicate<Student> p2=e2->e2.name.length()>4;

	for(Student s:l)
	{
	if(p1.test(s) && p2.test(s)){
		System.out.println(s.name+ " "+s.marks);
		
	}
		
		
	}
	
	
	for(Student s:l)
	{
		System.out.println(p.apply(s));
		
		
	}
Function<Integer,Integer> id = Function.identity();
    
    System.out.println(id.apply(3));
    
	
	
	
	
		
		

	
	
}
}
