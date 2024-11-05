package com.threading.waitnotify;
public class Waiter implements Runnable {

	public Resource resource;
	public Waiter(Resource r) {
		this.resource = r;
	}
	public Resource getResource() {
		return resource;
	}
	public void setResource(Resource resource) {
		this.resource = resource;
	}
	@Override
	public void run() {
		System.out.println("Waiter 1  Executing");
		System.out.println("Waiter 1 waiting to get the resource lock before sync block");	
		System.out.println("Waiting 1 Thread waiting to get Notified");

		synchronized (this.resource) {
			System.out.println("Waiter 1 acquire resource's lock");
			try {
				resource.wait();
				System.out.println("******After Notify Execution Resource Message - "+resource.getMessage());
				resource.setMessage("Written by Waiter 1 ");
				resource.notifyAll();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}		
		System.out.println("Waiter 1 RELEASED resource's lock");
		System.out.println("Waiter 1 outside sync block");
	}
}