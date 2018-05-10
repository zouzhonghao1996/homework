package com.java.ch05;

public class ArrayDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[][] array= {{12,34,45,64},{23,432,45,56},{34,67,78,45,34}};
      for(int i=0;i<array.length;i++) {
    	  System.out.println();
    	  for(int j=0;j<array[i].length;j++) {
    		  System.out.print(array[i][j]+" ");
    	  }
      }
     
	}

}
