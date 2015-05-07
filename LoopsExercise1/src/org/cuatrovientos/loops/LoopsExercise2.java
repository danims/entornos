/**
 * 
 */
package org.cuatrovientos.loops;

import java.util.Scanner;

/**
 * @author PC
 *
 */
public class LoopsExercise2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		Scanner reader = new Scanner(System.in);
		String line = "";
		
		System.out.println("Please, enter an integer number: ");
		line = reader.nextLine();
		number = Integer.parseInt(line);
		
		if ((number > 0) & ((number % 2) == 0)) {
			for (int i = 0; i < number; i++) {
				System.out.print(" * ");
				
			}
		} else {
			System.out.println("invalid number");
			System.exit(0);
			
		}
		
				
		

	}

}
