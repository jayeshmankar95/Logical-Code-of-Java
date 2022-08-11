package com.interview1;

public class React {
	int lenght;
	int width;
	void insert(int l,int w) 
	{
		lenght=l;
		width=w;
	}
		void show()
		{
			System.out.println(lenght*width);
		}
		public static void main(String[] args) 
		{
		React r1=new React();
	
		r1.insert(3, 5);
		r1.show();
		
		}

}
