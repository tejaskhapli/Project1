package com.concurrency.api;
///https://docs.oracle.com/javase/1.5.0/docs/api/java/util/concurrent/ThreadPoolExecutor.html
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

class RJTask implements Runnable{
	private String name;
    public RJTask(String name) {
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


class MyRejectedExecutionHandler implements RejectedExecutionHandler{

	@Override
	public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
		
		System.out.println("Executing Thread -"+ r.toString() +" with alternate handler");
		RejectedExecutionHandlerExample.AlternateThreadPoolExecutor.execute(r);
		
	}
	
}


public class RejectedExecutionHandlerExample {

	public static ThreadPoolExecutor AlternateThreadPoolExecutor = (ThreadPoolExecutor) Executors.newFixedThreadPool(5);
	
	public static void main(String[] args) {
		ThreadPoolExecutor fixedThreadPoolExecutor = (ThreadPoolExecutor) Executors.newFixedThreadPool(5);
		fixedThreadPoolExecutor.setRejectedExecutionHandler(new MyRejectedExecutionHandler());
		
		for(int i = 0; i<10; i++){
			
			RJTask task = new RJTask("Task - " + (i+1));
			fixedThreadPoolExecutor.execute(task);
			
			if(i == 6)
				fixedThreadPoolExecutor.shutdown();
		}

		fixedThreadPoolExecutor.shutdown();
		System.out.println("Execution Completed Main Method");
	}
	
}
