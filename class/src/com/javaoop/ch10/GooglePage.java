package com.javaoop.ch10;

public class GooglePage {
	private static int count;

	public GooglePage() {
		count++;
	}
	public static void getCount() {
		System.out.println("第"+count+"次访问Google网站");
	}
   public static void main(String[] args) {
	   System.out.println(GooglePage.count);
	   GooglePage tom=new GooglePage();
	   tom.getCount();
	   GooglePage jerry=new GooglePage();
	   jerry.getCount();
	   GooglePage rose=new GooglePage();
	   rose.getCount();
   }
}
