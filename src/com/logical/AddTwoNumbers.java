package com.logical;

import java.util.Scanner;

public class AddTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int no1,no2,sum;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First No");
		  no1=sc.nextInt();
		System.out.println("Enter Second No");
		 no2=sc.nextInt();	
		 sc.close();
	//	10, no2=20, sum;
		sum=no1+no2;
		
		System.out.println("Sum of two numbers:" + sum);

	}

}
