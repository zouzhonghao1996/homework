package com.java.demo;

public class Flower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				for (int x = 0; x < 10; x++) {
					if (i * 100 + j * 10 + x == i * i * i + j * j * j + x * x * x) {
						System.out.println(i * 100 + j * 10 + x);
					}
				}
			}
		}

	}

}
