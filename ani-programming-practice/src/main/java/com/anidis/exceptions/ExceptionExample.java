package com.anidis.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionExample {

	public static void main(String[] ani) {
		
		String data = null;
		
		// method 1 which cath throw from their child method
		
		
		//Method 2 which throw exception
		showData(getData(data));
	}

	private static void showData(Object data) {
		// TODO Auto-generated method stub
		
	}



	/**
	 * Gets the data.
	 *
	 * @return the data
	 */
	private static Object getData(String data) {
		

		try {
			data.toLowerCase(); // it will throw Null pointer()Un cheked Run Time Exception
			FileReader fl = new FileReader("Wrong"); //this while throw Checked and specific one

		} catch (FileNotFoundException ee) {

			System.out.println("File Issue >> " + ee.getMessage());

		}

		catch (RuntimeException exception) {
			System.out.println("RunTime Exception : " + exception.getMessage());

		} 
		
		catch (Exception ee) {
			System.out.println("Exception : " + ee.getMessage());

		} finally {
			System.out.println("-- Final Block Executed-- ");
		}
		
		return data;
	}
	
	
}
