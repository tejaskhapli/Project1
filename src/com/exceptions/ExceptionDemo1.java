package com.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ExceptionDemo1 {

	/*
	 * 	CHECKED EXCEPTIONS
	 * 						FileNotFoundException 
	 * 						IOException
	 * 						SQLException
	 * 						IOException
	 *  					ClassNotFoundException
	 * 						InvocationTargetException
	 * 			Checked exceptions are checked at compile-time.
	 * 
	 * 	UNCHECKED EXCEPTIONS 			
	 * 						NullPointerException
	 * 						ArrayIndexOutOfBoundsException
	 * 						ArithmeticException
	 * 						IllegalArgumentException
	 * 						NumberFormatException
	 * 			Unchecked exceptions are not checked at compile time.
	 * 			All Unchecked exceptions are direct sub classes of RuntimeException class.
	 */
	
	public static void main(String[] args) {

		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("");
			
			Connection jdbcConnection=DriverManager.getConnection("","", null);
			
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		
		} catch (IOException e) {
			
			e.printStackTrace();
		
		} catch (SQLException e) {
			
			e.printStackTrace();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		FileInputStream fis2 = null;
		
		try {
			
			//Unreachable catch block for NoSuchMethodException. 
			//This exception is never thrown from the try statement body
			// CHECKED EXCEPTION MUST BE THROWN FROM TRY BLOCK IN ORDER TO CATCH IN CATCH BLOCK
			// WE CANT JUST SIMPLY CATCH THE 'CHECKED' EXCEPTIONS WITHOUT EXECUTING SUSPECIOUS STATEMENT - 
			// RESULTS INTO COMPILE TIME ERROR
			
			fis = new FileInputStream("");
			
			Connection jdbcConnection2=DriverManager.getConnection("","", null);
			
			
			Class.forName("");
			
			
			Class<?> bookClass = Class.forName("Serial_Inheritance");
			
			Method getTagline = bookClass.getDeclaredMethod("getTagline");
			
		}
		// COMPILE TIME ERROR - WE SHOULD NEVER USE CHILD & PARENT EXCEPTION IN SAME MULTI CATCH BLOCK!
		//catch (Exception | FileNotFoundException | SQLException | IOException e){
		//}
		catch( FileNotFoundException | SQLException e ){
			
		}
		catch ( ClassNotFoundException | NoSuchMethodException | ArrayIndexOutOfBoundsException | NullPointerException e) {
			
		} catch (SecurityException  e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
