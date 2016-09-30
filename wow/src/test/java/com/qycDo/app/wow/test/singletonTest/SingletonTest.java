package com.qycDo.app.wow.test.singletonTest;


public class SingletonTest {

	
	
	/**
	 * 单例测试
	 * @param args
	 */
	public static void main(String[] args) {
		Singleton s1 =Singleton.getInstance();
		Singleton s2 =Singleton.getInstance();
		if(s1 == s2){
			System.out.println(s1.hashCode());
			System.out.println(s2.hashCode());
			System.out.println(s2.equals(s1));
			System.out.println("单例的情况");
		}
	}
}
