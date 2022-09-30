package com.lambdaexpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Test
{
	String name;
	int marks;
	
	public Test(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}
	
}

public class StreamDemo {

	public static void main(String[] args) {
		List<Test> l=new ArrayList<Test>();
		l.add(new Test("sowmya",100));
		l.add(new Test("chamu",150));
		l.add(new Test("sudheer",200));
		l.add(new Test("usha",250));
		l.add(new Test("santhosh",300));
	l.stream().filter(i->i.marks>=200).collect(Collectors.toList()).forEach(i->System.out.println(i.name+"---"+i.marks));
		
	}

}
