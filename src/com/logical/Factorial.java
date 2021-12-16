package com.logical;

import java.util.Scanner;

public class Factorial {

	static int fact;
    static int number;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Take input from the user
	      //Create an instance of the Scanner Class
	      Scanner sc=new Scanner(System.in);
	      //Declare and Initialize the variable
	      System.out.println("Enter the number: ");
	      int num=sc.nextInt();
	      int i=1,fact=1;
	      while(i<=num)
	      {
	          fact=fact*i;
	          i++;
	      }
	      System.out.println("Factorial of the number: "+fact);  
		
	}

}


/*
//Java Program to find the Factorial of a Number
import java.util.*;
public class Main
{
   public static void main(String []args)
   {
      //Take input from the user
      //Create an instance of the Scanner Class
      Scanner sc=new Scanner(System.in);
      //Declare and Initialize the variable
      System.out.println("Enter the number: ");
      int num=sc.nextInt();
      int i=1,fact=1;
      while(i<=num)
      {
          fact=fact*i;
          i++;
      }
      System.out.println("Factorial of the number: "+fact);  
   }   
}*/















/*
class FactorialExample{  
	 public static void main(String args[]){  
	  int i,fact=1;  
	  int number=5;//It is the number to calculate factorial    
	  for(i=1;i<=number;i++){    
	      fact=fact*i;    
	  }    
	  System.out.println("Factorial of "+number+" is: "+fact);    
	 }  
	}  */