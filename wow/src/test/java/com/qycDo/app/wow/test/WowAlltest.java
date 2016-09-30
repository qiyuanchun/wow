package com.qycDo.app.wow.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class WowAlltest {
	
	
	public static void main(String[] args) {
		try {
			File pathFile = new File("D:\\ioTestResult2.txt");
			if (!pathFile.exists()) {
				pathFile.createNewFile();
			}
			Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(pathFile, true)));
			writer.write("HI write class testxxxxxxxxxxxxxxxxx");
			writer.flush();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
