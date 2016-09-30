package com.qycDo.app.wow.test.ioTest;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class WriteFile implements IWriteFile {
	@Override
	public void writeIntoFile(String path, String content) {
		 /** 
         * 创建一个可以往文件中写入字符数据的字符流输出流对象 
         * 创建时必须明确文件的目的地 
         * 如果文件不存在，这回自动创建。如果文件存在，则会覆盖。 
         * 当路径错误时会抛异常 
         *  
         * 当在创建时加入true参数，会实现对文件的续写。 
         */
		FileWriter fileWriter = null;
		try {
			fileWriter = new FileWriter(path, true);
			   /** 
	         * 调用该对象的write方法，向文件写入字符。 
	         *  
	         * 其实写入到了临时存储缓冲区中 
	         */  
			fileWriter.write(content);
			 /** 
	         * 进行刷新，将字符写到目的地中。 
	         */  
			fileWriter.flush();
		} catch (Exception e) {
			 System.out.println(e.toString());  
		}finally {
			if(fileWriter != null){
				try {
					  /** 
			         * 关闭流，关闭资源。在关闭前会调用flush方法 刷新缓冲区。关闭后在写的话，会抛IOException 
			         */  
					fileWriter.close();
//					throw new RuntimeException("关闭失败");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
			}
		}
	}

	@Override
	public void createFile(String path) {
		try {
			File pathFile = new File(path);
			if (!pathFile.exists()) {
				pathFile.createNewFile();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	
}
