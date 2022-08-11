package com.interview1;

public class Student {

	int id;
	String name;
	float salary;
	 Student(int id,String name, float salary)  {
		 this.id=id;
		 this.name=name;
		 this.salary=salary;
	 }
	 	void display()
	 	{
	 		System.out.println(id+" "+name+" "+salary);
	 	}
	 		public static void main(String[] args)
	 		{
				Student s1=new Student(1, "Raju", 20000f);
				s1.display();
			}
			
}
