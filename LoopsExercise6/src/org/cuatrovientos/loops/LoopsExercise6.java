/**
 * 
 */
package org.cuatrovientos.loops;

import java.util.Scanner;

/**
 * @author PC
 *ejercicio factorial
 */
public class LoopsExercise6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		int factorial;
		Scanner reader = new Scanner(System.in);
		String line = "";
		
		System.out.println("Please, enter an integer number: ");
		line = reader.nextLine();
		number = Integer.parseInt(line);
		factorial = number;
		number = number - 1;
		
		while (number > 1) {
			factorial = factorial * number;
			number = number - 1;
		}
		System.out.println("Result: " + factorial);
	}

}
