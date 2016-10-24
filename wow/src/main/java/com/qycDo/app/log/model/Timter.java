package com.qycDo.app.log.model;

import java.sql.Timestamp;

import org.apache.commons.lang3.time.DateFormatUtils;


public class Timter {
	private long start;
	private long end;
	private Timestamp startTime;
	private Timestamp endTime;
	
	public void start(){
		start = System.currentTimeMillis();
		startTime = new Timestamp(start);
	}
	
	public void stop(){
		end = System.currentTimeMillis();
		endTime = new Timestamp(end);
	}
	
	public long time(){
		return end - start;
	}
	
	public String getStartTime(){
		return DateFormatUtils.format(startTime, "yyyy-MM-dd HH:mm:ss:SSS");
	}
	
	public String getEndTime(){
		return DateFormatUtils.format(endTime, "yyyy-MM-dd HH:mm:ss:SSS");
	}
	
	public String getStartTimeYYYYMMDD(){
		return DateFormatUtils.format(startTime, "yyyyMMdd");
	}
}
