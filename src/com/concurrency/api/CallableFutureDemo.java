package com.concurrency.api;

import java.sql.Time;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

class Factorial implements Callable<Integer>{

	public Factorial(int number) {
		this.number = number;
	}
	
	private int number;
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	@Override
	public Integer call() throws Exception {
		int result = 1;
		if(number == 1 || number == 0){
			System.out.println("Inside call method, result - "+1);
			return 1;	
		}
		else
		{
			for(int i = 2; i<=number; i++){
				result = result * i;
			}
			System.out.println("Inside call method, result - "+result);
			TimeUnit.MILLISECONDS.sleep(number * 1000);
			return result;
		}
	}
	
}


public class CallableFutureDemo {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Factorial fact = new Factorial(4);
		ExecutorService executor = Executors.newFixedThreadPool(4);
		Future<Integer> futureObject = executor.submit(fact);
		
		/*if(!futureObject.isDone()){
			System.out.println("Yet to complete task execution, cancelling the task");
			futureObject.cancel(false);
			System.out.println("cancelled this callable task...");
		}*/
		
		if(futureObject.isCancelled()){
			System.out.println("check is done after cancellation - "+ futureObject.isDone());
			System.out.println("futureObject.isCancelled, can't get result in main method");
		}
		else{
			System.out.println("Calling futureObject.get blocking method...");
			System.out.println("from main method, futureobject.get() - "+futureObject.get());
		}	
	}
}
