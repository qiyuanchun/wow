package com.qycDo.app.wow.test;

import java.io.File;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.locks.ReentrantLock;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.util.StopWatch;

import com.qycDo.app.log.model.LogInfo;
import com.qycDo.app.log.model.Timter;
import com.qycDo.app.util.PropertiesFileUtils;
import com.qycDo.app.wow.test.factoryTest.HairFactory;
import com.qycDo.app.wow.test.factoryTest.HairInterface;
import com.qycDo.app.wow.test.factoryTest.LeftHair;

public class WowAlltest {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
//			Timter timter = new Timter();
//			timter.start();
//			timter.stop();
//			LogInfo logInfo = new LogInfo(timter);
//			logInfo.setTimter(timter);
//			String[] array  = new String[]{"测试"};
//			LogInfo  logInfo = new LogInfo(timter, Arrays.asList(array));
//			logInfo.setList(Arrays.asList(array));
//			System.out.println(logInfo.toLog());
//			System.out.println("开始时间YYYYMMDD"+timter.getStartTimeYYYYMMDD());
//			System.out.println("开始时间yyyy-MM-dd HH:mm:ss:SSS"+timter.getStartTime());
//			System.out.println("结束时间yyyy-MM-dd HH:mm:ss:SSS"+timter.getEndTime());
//			System.out.println("时间差"+timter.time());
			
//			String Date1 = DateFormatUtils.format(new Timestamp(System.currentTimeMillis()),"yyyy-MM-dd HH:mm:ss:SSS");
//			String Date2 = DateFormatUtils.format(new Date(), "yyyy-MM-dd HH:mm:ss:SSS");
//			
//			System.out.println("data1:" + Date1);
//			System.out.println("data2:" + Date2);
//			System.out.println(PropertiesFileUtils.getPropertiesValue("src/test/java/com/qycDo/app/wow/type.properties", "left"));
//			Resource rs = new ClassPathResource("src/test/java/com/qycDo/app/wow/test/beanTest/BeanTest.java");
			Properties props = new Properties();
			Resource rs1 = new ClassPathResource("classpath:src/test/java/com/qycDo/app/wow/type.properties");
			props.load(rs1.getInputStream());
			PropertiesFileUtils.getProperties("src/test/java/com/qycDo/app/wow/type.properties");
//			 Object obj = Class.forName("com.qycDo.app.wow.test.factoryTest.LeftHair").newInstance();
//			 System.out.println(obj.getClass().getName());
//			DateFormatUtils.format(millis, pattern)
			int a = 0;
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
