package com.java.test;

import java.util.Scanner;

public class HomeWorkArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入6个数：");
		int[] arr = new int[6];
		int change = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		for (int i = arr.length-1; i > 0; i--) {
			for (int j = 0; j < i ; j++) {
				if (arr[j] > arr[j + 1]) {
					change = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = change;
				}
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
