package com.java.suanshu42;

public class Test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         for(int j=3;j<=1000;j++) {
        	 int i=2;
        	 while(j!=i) {
     			if(j%i==0) {
     				j=j/i;
     				System.out.print(i+"*");
     			}else {
     				i++;
     			}
     		}
         }
	}

}
