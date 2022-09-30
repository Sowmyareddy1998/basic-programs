package com.lambdaexpression;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;


class Employee
{
	String name;
	int salary;

	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
}


public class PredicateDemo {

	public static void main(String[] args) {
//		
//		Predicate<Integer> p=e->e%2==0;
//		System.out.println(p.test(50));
//		String[] a= {"srimukhi","pradeep","reshmi","anasuya","suma"};
//		Predicate<String> s=e1->e1.length()%2==0;
//        for(String s1:a)
//        {
//        	if(s.test(s1))
//        	{
//        		System.out.println(s1);
//        	}
//        }
		List<Employee> l=new ArrayList<>();
		l.add(new Employee("srimukhi", 10));
		l.add(new Employee("ravi", 20));
		l.add(new Employee("lasya", 10));
		l.add(new Employee("anasuya", 50));
		l.add(new Employee("pradeep", 50));
		l.add(new Employee("suma", 100));
		Predicate<Employee> p=e->e.salary>60;
		//Predicate<Employee> p2=e1->e1.name.length()>5;
		Predicate<Employee> p3=e2->e2.name.length()==4;
		Predicate<Employee> p4=e3->e3.name.length()%2==0;
		
		
		for(Employee em:l) {
			
			if(p.test(em)||
					
					p3.test(em)&&p4.test(em))
			{
				System.out.println(em.name+"  "+em.salary);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
