package com.threading.waitnotify;

class ExtThread extends Thread{
	@Override
	public void run() {
		System.out.println("ExtThreads RUN Method");
	}
}

public class ThreadDemo2 {

	public static void main(String[] args) {
		ExtThread ethread = new ExtThread();
		ethread.run();
	}
	
}
