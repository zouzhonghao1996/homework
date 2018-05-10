package com.java.suanshu42;

public class Test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        for(int i=1;i<5;i++) {
        	 for(int j=1;j<5;j++) {
        		 for(int x=1;x<5;x++) {
        	        	if(i!=j&&i!=x&&j!=x) {
        	        		System.out.println(i*100+j*10+x);
        	        	}
        	        }	
             }
        }
	}

}
