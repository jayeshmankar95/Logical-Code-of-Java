package com.interview1;

import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

public class Prime {
	public static void main(String[] args) {
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("is prime");
		}
		else
		{
			System.out.println("not prime");
		}
	}
}
