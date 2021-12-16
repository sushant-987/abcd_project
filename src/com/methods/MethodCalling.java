package com.methods;

public class MethodCalling {

	void m1()
	{
		m2("Sushant");
		System.out.println("m1 method");

//		System.out.println("m1 method");
	
	}
	
	void m2(String str){
		
		m3(10);
		System.out.println("m2 method");
	}
	
	void m3(int a){
		
		System.out.println("m3 method");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Test t=new Test();
      t.m1();
      t.m2();
		
		
	}

}
