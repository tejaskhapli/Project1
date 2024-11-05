package com.concurrency.api;

import java.util.ArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


/// INCOMPLETE AS OF NOW ///////
class Document{
	private int pageCount;
	String docName;
	public int getPageCount() {
		return pageCount;
	}
	public Document(String docName,int pageCount) {
		this.pageCount = pageCount;
		this.docName = docName;
	}
}

class Printer{
	
	static void printJob(Document singleDoc) throws InterruptedException{	
		Lock printerLock = new ReentrantLock();
		
		
		printerLock.lock();
		System.out.println("Thread - "+ Thread.currentThread().getName() + " has acquired the lock");
		System.out.println("Total Pages in "+ singleDoc.docName + " = " + singleDoc.getPageCount() );
		Thread.sleep(singleDoc.getPageCount()*100);
		System.out.println("Thread - " + Thread.currentThread().getName() + " executing printing...");
	
		printerLock.unlock();
		System.out.println("Thread - "+ Thread.currentThread().getName() + " has released the lock");
	}
}

class PrinterThread implements Runnable{

	Document printDoc;
	
	public void setPrintDoc(Document printDoc) {
		this.printDoc = printDoc;
	}

	@Override
	public void run() {
		Printer p = new Printer();
		try {
			Printer.printJob(printDoc);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

public class LockDemo {

	public static void main(String[] args) {
		ArrayList<Document> docList = new ArrayList<>();
		docList.add(new Document("D1", 100));
		docList.add(new Document("D2", 50));
		docList.add(new Document("D3", 200));

		ArrayList<PrinterThread> threadArray = new ArrayList<>();
		PrinterThread pt1 = new PrinterThread();
		pt1.setPrintDoc(docList.get(1));		
		PrinterThread pt2 = new PrinterThread();
		pt2.setPrintDoc(docList.get(2));

		threadArray.add(pt1);
		threadArray.add(pt2);


		for(PrinterThread thr : threadArray){
			Thread th = new Thread(thr);
			th.start();
		}
		
		
	}
	
}
