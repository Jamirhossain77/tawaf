package com.test;

import java.util.Arrays;
import java.util.jar.Attributes.Name;

import org.testng.annotations.Test;

public class DoubleArray {
	@Test
public void array() {
	
	int x;
	int y=8;
	Object[] a = new Object[5];
	a[0]="3";
	a[1]=5;
	a[2]=6;
	a[3]=4;
	a[4]=7;
	//System.out.println(a[4]);
	
	int[][]k1 = new int [3][2];
	k1[0][0]=8;
	k1[0][1]=9;
	//System.out.println(k1[0][1]);
	//System.out.println(k1[0][0]);
	
    
	int [][] k = {{1,4,7},{5,11,8,9},{2,6,3}}; 
    int max = k[0][0];
    
    for(int i=0;i<k.length;i++) {
    for(int j=0;j<k[i].length;j++) {
   if(k[i][j]>max) {max=k[i][j];
    	
      }	
    }	
  }
  // System.out.println(max);  
	

    int []a1= {1,5,3,6,4};
    for(int i=0;i<a1.length;i++) {
	//System.out.println(a1[i]);
    }

    
    int [][] k2 = {{11,4,7},{5,10,8,9},{2,6,1,3}}; 
    int min = k2[0][0];
    
    for(int i=0;i<k2.length;i++) {
    for(int j=0;j<k2[i].length;j++) {
   if(k2[i][j]<min) {min=k2[i][j];
    	
      }	
    }	
  }	
 // System.out.println(min);
			
		
			
	    
String [][]	name = {{"Islam","Habib"},{"Masum","Karim","Rubel"},{"Rahim","Zabber"}};
for (int i=0; i<name.length;i++) {
	for(int j=0; j<name[i].length;j++) {
		//System.out.println(name[i][j]);
		String s = name[i][j];
		System.out.println(s);
		//System.out.println(Arrays.toString(name[i]));
				
	}

      }
	}	
}

