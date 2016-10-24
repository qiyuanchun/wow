package com.qycDo.app.wow.test.threadTest;

import java.util.concurrent.locks.ReentrantLock;


public class ThreadTest {
	 private static ReentrantLock lock = new ReentrantLock();
		static String a = "a";
		Runnable r1 = new Runnable() {
			
			@Override
			public void run() {
				SetValue("r1");
//				System.out.println("线程1//"+a);
			}
		};
		Runnable r2 = new Runnable() {
			
			@Override
			public void run() {
				SetValue("r2");
//				System.out.println("线程2//"+a);
			}
		};
		public void SetValue(String value){
			lock.lock();
			a = value;
			lock.unlock();
		}
		
		public void ThreadMethodTest(){
			Thread thread1 = new Thread(r1);
			Thread thread2 = new Thread(r2);
			thread1.start();
			thread2.start();
			//俩个线程start但是并没有分配到时间片
			System.out.println(a);
		}
		
		public static void main(String[] args) {
			
				for (int i = 0; i < 11; i++) {
					ThreadTest threadTest = new ThreadTest();
					threadTest.ThreadMethodTest();
					System.out.println("===============================");	
				}
		}
			
}
