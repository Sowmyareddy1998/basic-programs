package com.lambdaexpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Filter {

	public static void main(String[] args) {
		
		
		
		List<Integer> l=Arrays.asList(1,2,3,4,5,6,8);
		List<Integer> ev=new ArrayList<>();
		
		
		for(Integer n:l) {
			if(n%2==0) {
				ev.add(n);
			}
		}
				System.out.println(ev);
			
		
	}

}
