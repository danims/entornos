/**
 * 
 */
package org.cuatrovientos.methods;

import java.util.Scanner;



/**
 * @author PC
 *
 */
public class Calculadora {

	/**
	 * Method to add numbers
	 * @param a
	 * @param b
	 * @return
	 */
	public static int add (int a, int b) {
		int result = 0;
		result = a + b;
		return result;
	}
	/**
	 * Method to subtract numbers
	 * @param a
	 * @param b
	 * @return
	 */
	public static int sub (int a, int b) {
		int result = 0;
		result = a - b;
		return result;
	}
	/**
	 * Method to multiply number
	 * @param a
	 * @param b
	 * @return
	 */
	public static int mul (int a, int b) {
		int result = 0;
		result = a * b;
		return result;
	}
	/**
	 * Method to divide number
	 * @param a
	 * @param b
	 * @return
	 */
	public static int div (int a, int b) {
		int result = 0;
		result = a / b;
		return result;
	}
	/**
	 * Method to read numbers
	 */
	public static int leerNumero () {
		int result = 0;
		
		
		Scanner reader = new Scanner(System.in);
		String line = "";
		
		System.out.println("Please enter a number: ");
		line = reader.nextLine();
		result = Integer.parseInt(line);
		return result;
	}
	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		int addition = 0;
		/*Scanner reader = new Scanner(System.in);
		String line = "";
		
		System.out.println("Please enter a number: ");
		line = reader.nextLine();
		a = Integer.parseInt(line);
		*/
		a = leerNumero();
		b = leerNumero();
		
		System.out.println(addition = add(a,b));
		
	}
}
