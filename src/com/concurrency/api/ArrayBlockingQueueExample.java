package com.concurrency.api;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;

public class ArrayBlockingQueueExample
{
    public static void main(String[] args) throws InterruptedException
    {
        ArrayBlockingQueue<Integer> priorityBlockingQueue = new ArrayBlockingQueue<>(5);
 
        //Producer thread
        new Thread(() ->
        {
            int i = 0;
            try
            {
                while (true)
                {
                	//Thread.sleep(4000);
                	System.out.println("Producer Blocked for space in queue");
                	System.out.println("Added : " + i + " to the Queue");
                	priorityBlockingQueue.put(++i);
                }
 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
 
        }).start();
 
        //Consumer thread
        new Thread(() ->
        {
            try
            {
                while (true)
                {
                	Thread.sleep(4000);
                	System.out.println("consumer blocked for producer to put in the queue");
                	Integer poll = priorityBlockingQueue.take();
                    System.out.println("Consumer consumed : " + poll);
                }
 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
 
        }).start();
    }
}