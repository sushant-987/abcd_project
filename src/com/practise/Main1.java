package com.practise;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      try{
    	  System.out.println("hi");
    	  newMethod();
    	  System.out.println("wow");
      }
      catch(Exception e){
    	  System.out.println("oops");
      }
      finally{
    	  
    	  System.out.println("bye");
      }
	}
	
   public static void newMethod(){
	   throw new Error("demo");
   }

}
