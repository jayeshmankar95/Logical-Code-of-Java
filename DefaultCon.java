package com.interview1;

public class DefaultCon {
	int no;
	String name;
	
	void show()
	{
		System.out.println(no+" "+name);
	}
	public static void main(String[] args) {
		DefaultCon d=new DefaultCon();
	d.show();	
	}

}
