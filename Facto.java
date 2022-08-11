package com.interview1;
// by using annonymus class
public class Facto {
	int n=5;
	int fact=1;
	void cal(int n)
		{
			for(int i=1;i<=n;i++)
			{
					fact=fact*i;
			}
			System.out.println(fact);
		}
	
	public static void main(String[] args) {
		 new Facto().cal(5);
	
	}
	
}