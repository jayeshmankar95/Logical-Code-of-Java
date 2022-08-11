package com.interview1;

public class ReverseString1 {
	
	
	
	 public static void main(String[] args)
	 {
	  String name="JOKER";
	  System.out.println("Before reverse string "+name);
	  System.out.print("After  reverse string ");
	 
	  for(int i=name.length()-1;  i>=0;   i--)
	 
	  {
		  System.out.print (name.charAt(i));
	  }
	  
	 }
	

}
