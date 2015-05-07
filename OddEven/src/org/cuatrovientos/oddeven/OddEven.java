/**
 * 
 */
package org.cuatrovientos.oddeven;

import java.util.Scanner;

/**
 * @author PC
 *
 */
public class OddEven {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		Scanner reader = new Scanner(System.in);
		String line = "";
		
		System.out.print("Enter a number:");
		line = reader.nextLine();
		num = Integer.parseInt(line);
		
		if ((num % 2) == 0) {
			System.out.println("Your number is EVEN");
		}	
			else 
				if ((num % 2) != 0) {
					System.out.println("Your number is ODD");
				}
	}

}
