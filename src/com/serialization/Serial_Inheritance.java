package com.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Parentclass{
	
	
	/**
	 * inheritance - https://youtu.be/rDMpNBmqH28?list=PLd3UqWTnYXOl0LRB42B9uTIT3NEDhjhF2
	 * externalization - https://youtu.be/pIpuShKZbSc?list=PLd3UqWTnYXOl0LRB42B9uTIT3NEDhjhF2
	 * customized serialization - https://youtu.be/p-98X_1mMIY?list=PLd3UqWTnYXOl0LRB42B9uTIT3NEDhjhF2   - Part 8
	 *  
	 */
	int x = 100;
	String y = "Parent JString";
	{
		System.out.println("Execution of isntance block...");
	}
	@Override
	public String toString() {
		return "Parentclass [ x=" + x + ", y=" + y + " ]";
	}
	
	public Parentclass(int ip) {
		x = ip;
	}
	public Parentclass() {
		System.out.println("inside parent default constructor");
	}
	
	
}


class Aclass extends Parentclass implements Serializable  {
	
	int i = 10;
	String j = "JString";
	//private static final long serialVersionUID = 1919218234;
	
	@Override
	public String toString() {
		return "Aclass [ i=" + i + ", j=" + j + " ]";
	}
	
}



public class Serial_Inheritance {

	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		
		
		System.out.println("createing child object..");
		Aclass aObject = new Aclass();
		
		FileOutputStream fos = new FileOutputStream("Store.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(aObject);		
		
		
		System.out.println("Deseri starts....");
		FileInputStream fis = new FileInputStream("Store.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Aclass aObjectOutput = (Aclass) ois.readObject();
		
		System.out.println(aObjectOutput);	
		System.out.println(aObjectOutput.x + " " + aObjectOutput.y );
		
		
	}
	
	
}


/*
 *  IF PARENT IS SERILAZIBLE, CHILD BY DEFAULT SERIALIZABLE
 *  
 *  IF CHILD IS SERILAZIBLE, PARENT NOT, THEN FOLLOWING STORY HAPPENS
 *   	A. AT THE TIME OF SERI JVM IGNORES ORIGINAL VALUES OF PARENT VARIABLES AND SAVES DEFAULT VALUES TO FILE
 *    	B. AT THE TIME OF DESER, JVM RUNS INSTANCE CONTROL FLOW AND ASSIGNS THE MODIFIED VALUES OF PARENT VARIABLES
 *    	   TO THE OUTPUT OBJECT.
 *    		1. INSTNACE CONTROL FLOW
 *    			a . IDENTIFICATION OF PARENT MEMBERS
 *    			b . EXECUTON OF INSTANCE VARIABLE ASSIGNMENT & INSTANCE BLOCK
 *    			c . EXECUTION OF DEFAULT CONSTRUCTOR 
 * 					(INVALID CLASS EXCEPTION WILL BE THROWN IF PARENT DOESN'T CONTAIN DEFAULT CONSTRUCTOR)
 * 
 */
