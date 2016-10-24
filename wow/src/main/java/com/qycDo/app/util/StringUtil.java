package com.qycDo.app.util;

import java.util.Collection;
import java.util.Map;



public class StringUtil {
	
	/**
	 * 封装对于String,数组，集合，数值的空判断
	 *  <font color="red">此方法不支持long类型数组</font>
	 * @param obj
	 * @return
	 */
	public static boolean isEmpty(Object obj){
		if(null == obj)
			return true;
		if(obj instanceof String)
			return ((String) obj).trim().length() == 0;
		if(obj instanceof Object[])
			return ((Object []) obj).length == 0;
		if(obj instanceof Collection)
			return ((Collection) obj).isEmpty();
		if(obj instanceof Map)
			return ((Map) obj).isEmpty();
		if(obj instanceof Number)
			return ((Number) obj).doubleValue()<=0;
		return false;
	}
	
	public static boolean isNotEmpty(Object obj){
		return !StringUtil.isEmpty(obj);
	}
	
	/**
	 * 通用为空判断仅针对long型数组
	 * @param array
	 * @return
	 */
	public static boolean isEmpty(long... array){
		if(array == null || array.length == 0)
			return true;
		return false;
	}
	public static boolean isNotEmpty(long... array){
		return !StringUtil.isEmpty(array);
	}
	
	
	public static String[] ArrayLong2String(long... array){
		if(array == null)
			return null;
		if(array.length == 0){
			return new String[0];
		}
		String[] result = new String[array.length];
		for (int i = 0; i < array.length; i++) {
			result[i] = String.valueOf(array[i]);
		}
		return result;
	}
	
	public static long[] ArrayString2Long(String... array){
		if(array == null)
			return null;
		if(array.length == 0)
			return new long[0];
		long[] result = new long[array.length];
		for (int i = 0; i < array.length; i++) {
			result[i] = Long.parseLong(array[i]);
		}
		return result;
	}
	
	public static String[] longArray2StringArray(long... array){
		if(array == null)
			return null;
		if(array.length == 0)
			return new String[0];
		String[] result = new String[array.length];
		for (int i = 0; i < array.length; i++) {
			result[i] = String.valueOf(array[i]);
		}
		return result;
	}
	
}
