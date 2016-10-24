package com.qycDo.app.log.model;

import java.util.List;

import com.qycDo.app.util.StringUtil;

public class LogInfo {
	private Timter timter;
	private List list;
	public LogInfo(Timter timter){
		this.timter = timter;
	}
	public LogInfo(Timter timter,List list){
		this.timter = timter;
		this.list = list;
	}
	public String toLog(){
		StringBuffer log = new StringBuffer();
		log.append("时间戳差值"+timter.time())
		.append("开始时间"+timter.getStartTime())
		.append("结束时间"+timter.getEndTime());
		if(StringUtil.isNotEmpty(list)){
			log.append(list.get(0).toString());
		}
		return log.toString();
	}
	public Timter getTimter() {
		return timter;
	}
	public void setTimter(Timter timter) {
		this.timter = timter;
	}
	public List getList() {
		return list;
	}
	public void setList(List list) {
		this.list = list;
	}
	
	
}
