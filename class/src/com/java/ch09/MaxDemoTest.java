package com.java.ch09;

public class MaxDemoTest {

	public static void main(String[] args) {
		MaxDemo max = new MaxDemo();
		System.out.println(max.max(5, 6));
		System.out.println(max.max(15l, 6l));
		System.out.println(max.max(35d, 6d));

	}

}
