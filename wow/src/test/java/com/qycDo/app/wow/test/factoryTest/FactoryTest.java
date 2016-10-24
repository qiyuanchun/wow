package com.qycDo.app.wow.test.factoryTest;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import com.qycDo.app.util.BeanUtil;
import com.qycDo.app.util.PropertiesFileUtils;
import com.qycDo.app.wow.model.User;

public class FactoryTest {

	
	/**
	 * 工厂测试
	 * @param args
	 */
	public static void main(String[] args) {
		//1.普通方式
		//定义一个接口的对象，多态
		HairInterface left = new LeftHair();
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
//		File f = new File("src/test/java/com/qycDo/app/wow/type1.properties");
//		System.out.println(f.getPath());
//		System.out.println(f.exists());
		System.out.println(PropertiesFileUtils.getPropertiesValue("src/test/java/com/qycDo/app/wow/type.properties", "left"));
	}
	
	
}
