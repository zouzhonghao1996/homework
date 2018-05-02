package com.java.test;

import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] in=new int[0];
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入一句话：");
        String string=scanner.nextLine();
        System.out.println("请输入你要查找的字：");
        String needFind=scanner.nextLine();
        if (string.indexOf(needFind)==-1) {
        	System.out.println("该字符串中没有你查找的字符！");
		}else {
			for (int i = 0; i < string.length(); i++) {
				if (string.indexOf(needFind,i)==-1) {
					break;
				}
			}
		}
        
	}

}
