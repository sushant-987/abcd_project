package com.methods;

public class Test2 {

	void m1(int a,char ch ) //local variables
	{
		System.out.println("m1 method");
		System.out.println(a);
		System.out.println(ch);
	}
	static void m2(String str, double d)
	{
		System.out.println("m2 method");
		System.out.println(str);
		System.out.println(d);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Test t=new Test();
       t.m1();
       Test.m2();
		
		System.out.println();
		
		
	}

}
