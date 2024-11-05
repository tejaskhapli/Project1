package com.concurrency.api;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class ScheduledTask implements Runnable{

	private String name;
	 
    public ScheduledTask(String name) {
        this.name = name;
    }
 
    public String getName() {
        return name;
    }
	
	@Override
	public void run() {
		System.out.println("Started execution of " + name);

		try {
			Thread.sleep(500);
			System.out.println("Completed execution of " + name);
			
			Thread.sleep(500);
		
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class ScheduledThreadPoolExecutorDemo {

	public static void main(String[] args) {
		
		ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) Executors.newScheduledThreadPool(2);
		scheduledThreadPoolExecutor.scheduleWithFixedDelay(new ScheduledTask("Repeat Task") , 2, 2, TimeUnit.SECONDS);

	}
	
	
}
