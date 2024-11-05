package com.threading.waitnotify;

public class ThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		Resource r = new Resource();
		r.setMessage("Resource's Message");
		System.out.println("******Resource Message Set By Main Thread- "+r.getMessage());
		Thread waiter = new Thread(new Waiter(r));
		waiter.start();
		
		//waiter.start();
		//Thread waiter2 = new Thread(new Waiter2(r));
		//waiter2.start();

		System.out.println("Have a sleep of 1 sec MAIN THREAD ");
		
		Thread.sleep(1000);

		Thread notifier = new Thread(new Notifier(r));
		notifier.start();
		
		waiter.join();
		Thread.sleep(5000);
		System.out.println("******Final Resource Message - "+r.getMessage());
	}
}
