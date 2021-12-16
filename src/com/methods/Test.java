package com.methods;

  public class Test {

	void m1() //instance method
	{
		System.out.println("instance m1 method");
	}
	
	static void m2()  //static method
	{
		System.out.println(" static m2 method");
		
	}
	
	public static void main(String[] args) {
		
		Test t=new Test();
		t.m1();
		Test.m2();
		
	}
	
}
