package com.interview1;
import java.util.*;
public class ReverseNo {
	public static void main(String[] args) {
		
		  int Number,
		  Result=0,
		  Lastdigit;
		  
		  Scanner input=new Scanner(System.in);
		  System.out.print("enter N value:");
		  Number=input.nextInt();
		  System.out.println("Original number is:"+ Number);
		  input.close();
		  
		  while(Number!=0)
		  {
			Lastdigit=Number%10;         //123 % 10
			Result=Result*10+Lastdigit;  //0=0*10+lastDigit
			Number=Number/10;			//123=123/10
		  }
		  
		  System.out.println("Reverse  number is:"+ Result);
			
		 }
		
	}


