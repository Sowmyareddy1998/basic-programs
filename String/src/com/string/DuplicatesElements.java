package com.string;

import java.util.HashSet;

public class DuplicatesElements {

	

  static boolean flag = false;

	public static void main(String[] args) {

String str[]= {"java","python",".net","java1","c++"};

//1.Alg
//for(int i=0;i<str.length;i++) {
//	for(int j=i+1;j<str.length;j++) {
//		if(str[i].equals(str[j])) {
//			
//			System.out.println(str[i]);
//			flag=true;
//			}
//	}
//}
//		if(flag==false)
		
		//System.out.println("no duplicates");
		//}
	
	

//2.Approach
	HashSet<String> hs=new HashSet<>();

for(String l:str) {
	
	//System.out.println(hs.add(l));
	//boolean flag=false;
	
	if(hs.add(l)==false) { 
		System.out.println("duplicate elements:"+l);
		flag=true;
	}
}
   if(flag==false) {
	   System.out.println("no duplicates");
	
}
	
}
}



