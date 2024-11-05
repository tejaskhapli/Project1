package com.threading.waitnotify;

public class Notifier implements Runnable {
	public Resource resource;
	public Notifier(Resource r) {
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
		System.out.println("Notifier Executing");

		synchronized (resource) {
			System.out.println("Notifier acquire resource's lock");
			try {
				System.out.println("Notifier will take 5 sec to complete its task");
				Thread.sleep(5000);
				resource.setMessage("Written By Notifier");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Notifier Work Done");
			resource.notifyAll();
			System.out.println("Notifier released resource's lock");
		}
	}
}
