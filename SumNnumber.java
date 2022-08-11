package com.interview1;

import java.util.Scanner;

public class SumNnumber {
	public static void main(String[] args) {
		
		int n,sum=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number :");
		
		n=sc.nextInt();
		
		for(int i=100;i<=n;i++)
		{
			sum=sum+i;
		}
		System.out.println(sum);
	}
}
