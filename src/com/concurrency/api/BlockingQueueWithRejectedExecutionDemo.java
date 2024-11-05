package com.concurrency.api;

/*
 * Core and maximum pool sizes
 *		  A ThreadPoolExecutor will automatically adjust the pool size (see getPoolSize()) according to the bounds set by 
 * corePoolSize (see getCorePoolSize()) and maximumPoolSize (see getMaximumPoolSize()). 
 * When a new task is submitted in method execute(java.lang.Runnable), and fewer than corePoolSize threads are running, 
 * a new thread is created to handle the request, even if other worker threads are idle. If there are more than 
 * corePoolSize but less than maximumPoolSize threads running, a new thread will be created only if the queue is full. 
 * By setting corePoolSize and maximumPoolSize the same, you create a fixed-size thread pool. By setting maximumPoolSize 
 * to an essentially unbounded value such as Integer.MAX_VALUE, you allow the pool to accommodate an arbitrary number of 
 * concurrent tasks. Most typically, core and maximum pool sizes are set only upon construction, but they may also be 
 * changed dynamically using setCorePoolSize(int) and setMaximumPoolSize(int).
 * */

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class BQRJTask implements Runnable{
	private String name;
    public BQRJTask(String name) {
        this.name = name;
    }
    public String getName() {
    	
        return name;
    }
	@Override
	public void run() {	
		System.out.println("Started Executing Task - " + name);
		try {
			Thread.sleep(1000);
			System.out.println("Complete Executing Task - " + name);
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}
}

class CustomThreadPoolExecutor extends ThreadPoolExecutor{

	public CustomThreadPoolExecutor(int corePoolSize, int maximumPoolSize, long keepAliveTime, TimeUnit unit,
			BlockingQueue<Runnable> workQueue) {
		super(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue);
	}
	
	@Override
	protected void beforeExecute(Thread t, Runnable r) {
		// TODO Auto-generated method stub
		super.beforeExecute(t, r);
		System.out.println("Executing BeforeExecute of Custom ThreadPoolexecutor");
	}

	@Override
	protected void afterExecute(Runnable r, Throwable t) {
		// TODO Auto-generated method stub
		super.afterExecute(r, t);
		System.out.println("Executing AfterExecute of Custom ThreadPoolexecutor");
	}
	
}

public class BlockingQueueWithRejectedExecutionDemo {

	public static void main(String[] args) {
		
		BlockingQueue<Runnable> workQueue = new ArrayBlockingQueue<Runnable>(50);
		CustomThreadPoolExecutor customExecutor = new CustomThreadPoolExecutor(10, 20, 10, TimeUnit.SECONDS, workQueue);
		customExecutor.setRejectedExecutionHandler(new RejectedExecutionHandler() {	
			@Override
			public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
				
			}
		});
		
	}
	
	
}
