package com.qycDo.app.wow.test.factoryTest;

import com.qycDo.app.util.PropertiesFileUtils;

public class HairFactory {

	public HairInterface getHair(String hair){
		if("left".equals(hair)){
			return new LeftHair();
		}else if("right".equals(hair)){
			return new RightHair();
		}else{
			return null;
		}
	}
	
	/**
	 * 根据类名获取实例
	 * 反射，根据类名创建实例
	 * @param className
	 * @return
	 */
	public HairInterface getByClassName(String className){
		
		try {
			//通过反射创建类的实例
			HairInterface hair = (HairInterface) Class.forName(className).newInstance();
			return hair;
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
}
