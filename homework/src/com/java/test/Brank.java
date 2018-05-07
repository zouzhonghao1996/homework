package com.java.test;

import java.util.Scanner;

public class Brank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 银行存钱
	/*	double money=10000;
        for(int i=0;i<5;i++) {
        	money=money+money*3/1000;
        }
        System.out.println(money);*/
		//正整数翻转输出
		 Scanner scanner=new Scanner(System.in);
	     System.out.println("请输入一个数：");
	     String input=scanner.nextLine();
	         String x="";
	     for(int i=(input.length()-1);i>=0;i--) {
 	        x=x+input.charAt(i);   
	     }
	     System.out.println(x);
	}

}
