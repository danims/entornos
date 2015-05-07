/**
 * 
 */
package org.cuatrovientos.methods;

import java.sql.Date;

/**
 * Shows the use of methods
 * @author PC
 *
 */
public class Methods {
	
	public static void sayHello () {
		System.out.println("Hello");
	}

	public static int add (int a, int b) {
		int result = 0;
		result = a + b;
		return result;
	}
	public static void msg (String message) {
		drawLineCustom("*",42);
		System.out.println(message);
		drawLineCustom("/\\",21);
	}
	public static void drawLine () {
		String line = "";
		for (int i=0;i<80;i++) {
			line = line + "-";
		}
		System.out.println(line);
		
	}
	public static void drawLineCustom (String c, int length) {
		String line = "";
		for (int i=0;i<80;i++) {
			line = line + c;
		}
		System.out.println(line);
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sayHello();
		int c = add(600,66);
		msg("Result is: " + c);
		
		
	}

}
