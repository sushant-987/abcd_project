package com.variables;

public class Test {
	
	//static variables
	static int a=10;
	static int b=20;
	
   //static method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println(a);
    System.out.println(b);
	Test t=new Test();
	t.m1();
		
	}
	
	void m1(){
		
		System.out.println(a);
		System.out.println(b);
	}

}
