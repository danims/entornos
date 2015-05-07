/**
 * 
 */
package cuatrovientos.org.conditionals;

import java.util.Scanner;

/**
 * @author Daniel Martin
 *
 */
public class ConditionalsExercise1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		
		Scanner reader = new Scanner(System.in);
		String line = "";
		
		System.out.println("Enter a number:");
		// Read from console
		line = reader.nextLine();
		System.out.println("You entered: " + line);
		// Converts line to int
		a = Integer.parseInt(line);
		
		if (a < 0) {
			System.out.println("Your number is negative");
		}	
			else 
				if (a == 0) {
					System.out.println("Your number is equal to 0");
				}
					else {
						System.out.println("Your number is positive");
					}	
		}

}
