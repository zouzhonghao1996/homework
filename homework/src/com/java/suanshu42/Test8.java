package com.java.suanshu42;

public class Test8 {

	public static void main(String[] args) {
		int a = 2;
		int sum = 0;
		for (int j = 1; j < 6; j++) {
			int s = 2;
			for (int i = j - 1; i >= 1; i--) {
				s = (int) (s + a * Math.pow(10, i));
			}
			sum = sum + s;
			System.out.print(s + " ");
		}
		System.out.println(sum);
	}

}
