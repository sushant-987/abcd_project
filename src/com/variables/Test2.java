package com.variables;

public class Test2 {
	int a=10;
	static int b=20;
	static int c=30;
	static int d=40;
	
	void m1(){
		System.out.println(a);
		System.out.println(b);
		System.out.println(Test2.c);
		System.out.println(Test2.d);
		
	}

	static void m2(){
		Test t2=new Test();
		System.out.println(t2.a);
		System.out.println(t2.b);
		System.out.println(c);
		System.out.println(d);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Test2 t2=new Test2();
      t2.m1();
      Test2.m2();
	}

}
