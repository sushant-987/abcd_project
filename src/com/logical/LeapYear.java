package com.logical;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

    int num;
    
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Year:");
    num=sc.nextInt();
    
    if(num%4==0)
    {
    	System.out.println("Enterd year is leap year");
    }
    else{
    	System.out.println("Entered year is not leap year");
    }
	}

}
