package com.java.demo;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		int sum=0;
		do {
			if(i%2==0) {
				System.out.println(i);
				sum+=i;
			}				
			i++;
		}while(i<=100);
		System.out.println(sum);
	}

	public static long fac(int f) {
		if (f == 1) {
			return 1;
		} else {
			return f * fac(f - 1);
		}
	}

}
