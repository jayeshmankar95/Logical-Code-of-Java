package com.interview1;


public class MaxThreeNo {

	public static void main(String[] args) {
	
		int n1=1110,n2=222,n3=3552;
		
		if(n1>n2 && n1>n3)
		{
			System.out.println("n1 is greater");
		}
			else if (n2>n1 && n2>n3) 
			{
				System.out.println("n2 is greater");
			}
				else
				{
				System.out.println("n3 is greater");	
				}
}
}
