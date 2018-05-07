package com.java.ch05;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int[] array=new int[] {10,20,30,40,50,60};
         System.out.println(array[0]+" "+array[5]);
         System.out.println("数组的长度:"+array.length);
         int max=array[0];
         for(int i=0;i<array.length;i++) {
        	if(array[i]>max) {
        		max=array[i];
        	}
         }
         System.out.println(max);
	}

}
