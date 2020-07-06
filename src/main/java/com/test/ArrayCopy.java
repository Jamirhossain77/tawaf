package com.test;

import org.testng.annotations.Test;

   public class ArrayCopy {

   @Test	
   public void copyArray() {
	
	
	int [] num = {10,20,30,40,50};
	
	int [] num2=new int [num.length];
	
	/*for(int i = 0; i<num.length; i++) {	
	    //num2[i] =num[i];
	
	    //System.out.println(num2[i]);
	}*/
	
	
	/*for (int  i=num.length-1; i>=0; i--) {
	     //num2[i]=num[i];
	
	     //System.out.println(num[i]);
	}*/
	
	for(int i=2; i<num.length;i++) {
       num2[i]=num[i];
		System.out.println(num2[i]);
	}

	 
	    
	  
	    }	
	  
		


}	
	
	
