package com.java.suanshu42;

public class Test6 {
	public static int gys(int m, int n) {
		int x;
		if (m >= n) {
			if (m % n == 0) {
				return n;
			} else {
				return gys(n, m % n);
			}
		} else {
			x = n;
			n = m;
			m = x;
			return gys(m, n);
		}

	}

	public static void main(String[] args) {
		System.out.println(gys(6, 9));
		System.out.println(6*9/gys(6,9));
	}
}
