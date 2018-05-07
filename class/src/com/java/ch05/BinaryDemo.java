package com.java.ch05;

public class BinaryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.println("十进制转十六进制："+Integer.toHexString(150));
         System.out.println("十进制转八进制："+Integer.toOctalString(150));
         System.out.println("十进制转二进制："+Integer.toBinaryString(150));
         
         System.out.println("十六进制转十进制："+Integer.valueOf("96", 16).toString());
         System.out.println("八进制转十进制："+Integer.valueOf("226", 8).toString());
         System.out.println("二进制转十进制："+Integer.valueOf("10010110", 2).toString());
	}

}
