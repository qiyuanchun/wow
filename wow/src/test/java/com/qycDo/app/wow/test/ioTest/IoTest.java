package com.qycDo.app.wow.test.ioTest;


import org.junit.Test;


public class IoTest {

	IWriteFile writeIntoFile = new WriteFile();
	@Test
	public void writeIntoFiletest() {
		String content = "HI THIS IS IOTEST";
		writeIntoFile.writeIntoFile("D:\\ioTestResult2.txt", content);
	}

}




