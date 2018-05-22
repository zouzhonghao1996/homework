package com.javaoop.ch14.animalinterface;

public class GoldFish implements Fish{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("鱼儿游...");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("鱼吃食物...");
	}

	@Override
	public void breath() {
		// TODO Auto-generated method stub
		System.out.println("鱼用鳃呼吸...");
	}

}
