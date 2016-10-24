package com.qycDo.app.wow.test.logTest;

import java.io.File;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.lang3.time.DateFormatUtils;

import com.alibaba.druid.pool.DruidDataSource.CreateConnectionThread;
import com.qycDo.app.util.PropertiesFileUtils;

public class WriteLog {
	
	public void createFileByDate(String createDate){
		String fileName = "createTest"+createDate+".log";
		String path = PropertiesFileUtils.getPropertiesValue("src/test/java/com/qycDo/app/wow/type.properties", "logPath");
		if(!path.endsWith("/")){
			path = path +"/";
			File file = new File(path);
			if(!file.exists()){
				file.mkdirs();
			}	
		}
	}
	
	public static void main(String[] args) {
		WriteLog writeLog = new WriteLog();
		writeLog.createFileByDate(DateFormatUtils.format(new Date(), "yyyy-MM"));
	}
}
