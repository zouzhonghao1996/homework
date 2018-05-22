package com.javaoop.ch14.animalinterface;

public interface Animal {
	//接口中的所有方法都是公共的抽象方法
	//接口中的变量都是公共的静态常量（常量的命名：字母大写 TAG AGE_FLAG
	//子接口可继承extends多个父接口
	//子类实现 implements接口
	int TAG=1;
	void run();

	void eat();
}
