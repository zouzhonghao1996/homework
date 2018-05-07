package com.java.demo;

public class LogicDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		if (++a == 12 & ++b == 22) {
			System.out.println("执行了");
		}
		System.out.println(a + " " + b);
		a = 10;
		b = 20;
		if (a++ == 10 && ++b == 22) {
			System.out.println("执行了");
		}
		System.out.println(a + " " + b);
	}

}
