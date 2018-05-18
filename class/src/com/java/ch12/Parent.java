package com.java.ch12;

public class Parent {
  public String pubVar="公共的";
  protected String proVar="受保护的";
  String defVar="缺省的";
  private String priVar="私有的";
  
  public void show() {
	  System.out.println(pubVar+" "+proVar+" "+defVar+" "+priVar);
  }
}
