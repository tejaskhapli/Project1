package com.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class BClass implements Serializable{
	
	transient int i = 6;
	String j = "String";
	int p = 999;
	int k = 7;
	//private static final long serialVersionUID = 132165427;
	@Override
	public String toString() {
		return "BClass [i=" + i + ", j=" + j + " p = "+ p + "]";
	}
}


public class Serial_First {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
	
		
		/*BClass bObject = new BClass();
		
		FileOutputStream fos = new FileOutputStream("Store.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(bObject);
*/
		
		System.out.println("Deseri starts....");
		FileInputStream fis = new FileInputStream("Store.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		BClass bObjectOutput = (BClass) ois.readObject();
		
		System.out.println(bObjectOutput);
	}
	
	
}
