package com.lambdaexpression;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class CompareDemo {

	public static void main(String[] args) {

   List<Integer> l=new ArrayList<Integer>();
   l.add(10);
   l.add(20);
   l.add(4);
   l.add(2);
   System.out.println(l);
   //Comparator<Integer> c=(I1,I2)->(I1<I2)?-1:(I1>I2)?1:0;
   Collections.sort(l);

   System.out.println("ascending order->"+l);
  // Collections.reverse(l);
   //System.out.println(l);
//   Comparator<Integer> com=new  Comparator<Integer>() {
//   
//   public int compare(Integer o1, Integer o2) {
//		if(o1>o2)
//			return -1;
//		else
//			if(o1<o2)
//				return 1;
//			else
//				
//		return 0;
//	}
//   };
//   
   //Collections.sort(l, com);
   
   Comparator<Integer> com=( i1, i2)->(i1>i2)?-1:(i1<i2)?1:0;
//	   if(i1>i2)
//	   return -1;
//	   else
//		   if(i1<i2)
//			   return 1;
//		   else
//	return 0;
   
//	   
//   
//	};
	Collections.sort(l, com);
   System.out.println("descending order->"+l);

//   for(int l1:l) {
//  System.out.println(l1);
	   }
   
   
  
		
  
	}


