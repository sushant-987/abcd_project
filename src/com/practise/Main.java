package com.practise;

public class Main {
	
	 static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
      if(count < 3){
    	  
    	  count++;
    	  main(null);
    	  
      }
      else
      {
    	  return;
      }
      System.out.println("Hello World");
    	  
	}

}
