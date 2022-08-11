package com.interview1;

import java.util.Scanner;

public class Mark {
public static void main(String[] args) {
	
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your mark : ");
	int mark=sc.nextInt();
	
	
	
	if(mark>80)
	{
		System.out.println("A division");
	}
		else if (mark<=80 && mark>=60)
		{
		System.out.println("B Division");
		}
		else if(mark<=60 && mark >=40)
		{
			System.out.println("c Divisions");
		}
	else {
		System.out.println("fail");
	}
}
}
