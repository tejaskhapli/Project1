package com.concurrency.api;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

class Task implements Runnable{

	private String name;
	 
    public Task(String name) {
        this.name = name;
    }
 
    public String getName() {
        return name;
    }
	@Override
	public void run() {	
		System.out.println("Started Executing Task - " + name);
		try {
			
				Thread.sleep(3000);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Complete Executing Task - " + name);
		try {
			//margin between two tasks
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}

public class FixedThreadPoolExecutorDemo {
	
	public static void main(String[] args) {
		
		ThreadPoolExecutor fixedThreadPoolExecutor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);
		for(int i = 0; i<6; i++){
			Task t = new Task("T-"+ (i+1));
			fixedThreadPoolExecutor.execute(t);			
		}
		fixedThreadPoolExecutor.shutdown();
		System.out.println("shut down complete");

	}
}
