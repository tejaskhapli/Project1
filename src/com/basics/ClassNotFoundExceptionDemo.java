package com.basics;
public class ClassNotFoundExceptionDemo
{
	
	
	/*
	 * ClassNotFoundException is a run time exception which is thrown when an application tries to 
	 * load a class at run time using Class.forName() or loadClass() or findSystemClass() methods 
	 * and the class with specified name are not found in the classpath. 
	 * For example, you may have come across this exception when you try to connect to MySQL/Oracle databases and 
	 * you have not updated the classpath with required JAR files. In most of time, 
	 * this exception occurs when you try to run an application without updating the 
	 * classpath with required JAR files.
	 * */
    public static void main(String[] args)
    {
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
    }
}