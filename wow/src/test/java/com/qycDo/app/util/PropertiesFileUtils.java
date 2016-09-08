package com.qycDo.app.util;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import org.apache.commons.lang3.StringUtils;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class PropertiesFileUtils {

	/**
	 * 根据key读取value
	 * 
	 * @param filePath
	 * @param key
	 * @return
	 * @author zg
	 * @date 2015-12-30
	 */
	public static String getPropertiesValue(String filePath, String key) {
		Properties props = getProperties(filePath);
		return props.getProperty(key);
	}

	/**
	 * 根据key读取value
	 * 
	 * @param filePath
	 * @param key
	 * @param defaultValue
	 * @return
	 * @author zg
	 * @date 2015-12-30
	 */
	public static String getPropertiesValue(String filePath, String key, String defaultValue) {
		String value = getPropertiesValue(filePath, key);
		return StringUtils.isEmpty(value) ? defaultValue : value;
	}

	/**
	 * 读取properties文件
	 * 
	 * @param filePath
	 * @return
	 * @author zg
	 * @date 2015-12-30
	 */
	public static Properties getProperties(String filePath) {
		Properties props = new Properties();
		Resource rs = new ClassPathResource(filePath);
		try {
			props.load(rs.getInputStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return props;
	}

	/**
	 * 读取properties的全部信息
	 * 
	 * @param filePath
	 * @return
	 * @author zg
	 * @date 2015-12-30
	 */
	public static Map<String, String> readProperties(String filePath) {
		Properties props = getProperties(filePath);
		Map<String, String> map = new HashMap<String, String>();

		for (Map.Entry<?, ?> entry : props.entrySet()) {
			String key = (String) entry.getKey();
			String value = (String) entry.getValue();
			map.put(key, value);
		}

		return map;
	}

	/**
	 * 读取properties的所有key
	 * 
	 * @param filePath
	 * @return
	 * @author zg
	 * @date 2015-12-30
	 */
	public static List<String> readPropertiesKeys(String filePath) {
		Properties props = getProperties(filePath);
		List<String> keyList = new ArrayList<String>();
		Enumeration<?> enumeration = props.propertyNames();
		while (enumeration.hasMoreElements()) {
			String key = (String) enumeration.nextElement();
			keyList.add(key);
		}
		return keyList;
	}

	/**
	 * 读取properties的所有value
	 * 
	 * @param filePath
	 * @return
	 * @author zg
	 * @date 2015-12-30
	 */
	public static List<String> readPropertiesValues(String filePath) {
		Properties props = getProperties(filePath);
		List<String> valueList = new ArrayList<String>();
		Enumeration<?> enumeration = props.elements();
		while (enumeration.hasMoreElements()) {
			String value = (String) enumeration.nextElement();
			valueList.add(value);
		}
		return valueList;
	}

	/**
	 * 写入properties信息
	 * 
	 * @param filePath
	 * @param parameterName
	 * @param parameterValue
	 * @author zg
	 * @date 2015-12-30
	 */
	public static void writeProperties(String filePath, String parameterName, String parameterValue) {
		Properties prop = new Properties();
		try {
			InputStream fis = PropertiesFileUtils.class.getClassLoader().getResourceAsStream(filePath);
			// 从输入流中读取属性列表（键和元素对）
			prop.load(fis);
			// 调用 Hashtable 的方法 put。使用 getProperty 方法提供并行性。
			// 强制要求为属性的键和值使用字符串。返回值是 Hashtable 调用 put 的结果。
			OutputStream fos = new FileOutputStream(filePath);
			prop.setProperty(parameterName, parameterValue);
			// 以适合使用 load 方法加载到 Properties 表中的格式，
			// 将此 Properties 表中的属性列表（键和元素对）写入输出流
			prop.store(fos, "Update '" + parameterName + "' value");
		} catch (Exception e) {
			System.err.println("Visit " + filePath + " for updating " + parameterName + " value error");
		}
	}
}
