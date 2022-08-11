package com.interview1;

public class ParaCon {
	int id;
	String name;
	ParaCon(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	 void show()
	 {
		 System.out.println(id+" "+name);
	 }
	 public static void main(String[] args) {
		ParaCon pc=new ParaCon(1, "Rama");
		pc.show();
	}
	 

}
