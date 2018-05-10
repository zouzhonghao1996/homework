package com.java.test;

public class Frog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 青蛙爬井
      int day=0;
      int high=0;
      while(true) {
    	  day++;
    	  high+=3;
    	  if(high>=7) {
    		 break; 
    	  }
    	  high-=2;
    	 
      }
      System.out.println("需要"+day+"天爬出井");
	}

}
