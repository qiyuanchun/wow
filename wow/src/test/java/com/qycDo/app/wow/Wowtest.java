package com.qycDo.app.wow;

import java.io.File;
import java.util.Properties;

import com.qycDo.app.util.PropertiesFileUtils;

public class Wowtest {

	
	/**
	 * 工厂测试
	 * @param args
	 */
	public static void main(String[] args) {
		//1.普通方式
		//定义一个接口的对象，多态
//		HairInterface left = new LeftHair();
//		left.draw();
		//2.工厂方式
//		HairFactory hairFactory = new HairFactory();
//		HairInterface hair = hairFactory.getHair("right");
//		if(hair != null)
//		hair.draw();
		//3.根据反射实现用类名 在工厂中创建实例
//		HairFactory hairFactory = new HairFactory();
//		HairInterface hair = hairFactory.getByClassName("com.qycDo.app.wow.RightHair");
//		hair.draw();
		File f = new File("src/test/java/com/qycDo/app/wow/type.properties");
		System.out.println(f.getPath());
		System.out.println(PropertiesFileUtils.getPropertiesValue("src/test/java/com/qycDo/app/wow/type.properties", "left"));
	}
	
	
	
	/**
	 * 单例测试
	 * @param args
	 */
//	public static void main(String[] args) {
//		Singleton s1 =Singleton.getInstance();
//		Singleton s2 =Singleton.getInstance();
//		if(s1 == s2){
//			System.out.println(s1.hashCode());
//			System.out.println(s2.hashCode());
//			System.out.println(s2.equals(s1));
//			System.out.println("单例的情况");
//		}
//	}
}
