package com.java.test;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork2 {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] recording=new int[0];
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入一句话：");
        String input=scanner.nextLine();
        System.out.println("请输入你要查找的字：");
        String needFind=scanner.nextLine();
        char nf=needFind.charAt(0);
        for (int i = 0; i < input.length(); i++) {
        	if (input.charAt(i)==nf) {
        		recording=Arrays.copyOf(recording, recording.length+1);
        		recording[recording.length-1]=i;   		
			}			
		}
        System.out.println("该字符在字符串中出现的位置为：");
        for (int i = 0; i < recording.length; i++) {       	
			System.out.print(recording[i]);
		}
        
	}

}
