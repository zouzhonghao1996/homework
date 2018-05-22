package com.javaoop.ch14.animalinterface;

public abstract class Beast implements Animal {
	public void run() {
	 System.out.println("兽儿跑...");
	}
	public abstract void eat();
}
