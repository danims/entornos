/**
 * 
 */
package org.cuatrovientos.arrays;

import java.util.Scanner;

/**
 * @author PC
 *
 */
public class ArraysExercise3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] numbers = {0,0,0,0,0,0,0,0,0,0};
		Scanner reader = new Scanner(System.in);
		String line = "";
		for (int i = 0;i<numbers.length;i++) {
			System.out.println("Enter a number");
			line = reader.nextLine();
			numbers[i] = Integer.parseInt(line);
			
		}
		/** for (int i = 0;i<numbers.length;i++) {
			for (int j = 0;j<numbers.length;j++) {
				if (numbers[i] == numbers[j]) {
					System.out.println("Repeated element");
					
				}
			}
		}*/
		for (int i = 0;i<numbers.length;i++) {
			for (int j = i+1;j<numbers.length;j++) {
				if (numbers[i] == numbers[j]) {
					System.out.println("Repeated element " + numbers[i]);
					//return;)
					System.exit(0);
					
			}
			
		}
	}

}
}
