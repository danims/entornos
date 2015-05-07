/**
 * 
 */
package org.cuatrovientos.loops;

import java.util.Scanner;

/**
 * @author PC
 *
 */
public class LoopsExercise5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 0;
		Scanner reader = new Scanner(System.in);
		String line = "";
		
		System.out.println("Please, enter an integer number: ");
		line = reader.nextLine();
		number = Integer.parseInt(line);
		if (number > 0) {
			for (int i = 0; i < number; i++) {
				for (int e = 0; e < number; e++) {
				System.out.print("* ");
			}
				System.out.println("");
			}
		} else {
			System.out.println("invalid number");
			System.exit(0);
			
		}

	}

}
