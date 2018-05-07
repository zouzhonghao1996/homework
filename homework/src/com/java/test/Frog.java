package com.java.test;

public class Frog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 青蛙爬井
      int day=1;
      int high=0;
      while(true) {
    	  high+=3;
    	  if(high>=7) {
    		 break; 
    	  }
    	  high-=2;
    	  day++;
      }
      System.out.println("需要"+day+"天爬出井");
	}

}
