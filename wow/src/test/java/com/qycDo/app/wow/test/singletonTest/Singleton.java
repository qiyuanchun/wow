package com.qycDo.app.wow.test.singletonTest;

public class Singleton {

	private  Singleton(){
		System.out.println("调用了构造方法");
	}
	
	private static Singleton instance = new Singleton();
	
	public static Singleton getInstance(){
		return instance;
	}
}
