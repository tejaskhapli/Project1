package com.concurrency.api;

import java.util.concurrent.ThreadFactory;

class RunnableInstance implements Runnable{
	@Override
	public void run() {
	System.out.println("Run method of - RunnableInstance ");
	}
}

class MyThreadFactory implements ThreadFactory{
	@Override
	public Thread newThread(Runnable r) {
		Thread t = new Thread(r);
		return t;
	}
}

public class ThreadFactoryDemo {

	public static void main(String[] args) throws InterruptedException {
		MyThreadFactory myFactory = new MyThreadFactory();
		RunnableInstance runnableInst = new RunnableInstance();
		Thread threadFromFactory = myFactory.newThread(runnableInst);
		threadFromFactory.start();
		
		threadFromFactory.join();
		
		System.out.println("ALL thread execution completed. Exiting from main thread");
	}
	
}
/*
 * Executors, ExecutorService, ThreadPoolExecutor
 * 
 * create object of threadpoolexecutor using Executors static methods
 * 
 * 
 * 
 * 
 * 
 * */