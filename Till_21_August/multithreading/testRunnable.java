package com.revature;

public class testRunnable {
	public static void main(String ...args) {
		
		RunnableDemo R1=new RunnableDemo("Thread-1");
		Thread t1=new Thread(R1);
		t1.start();
		
		RunnableDemo R2=new RunnableDemo("Thread-2");
		Thread t2=new Thread(R2);
		t2.start();
		
	}


}
