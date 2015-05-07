/**
 * 
 */
package org.cuatrovientos;

import java.util.Scanner;

/**
 * @author PC
 *
 */
public class EstructurasDeControl {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		String line = "";
		Scanner reader = new Scanner(System.in);
		
		
		System.out.print("Enter a number:");
		line = reader.nextLine();
		num = Integer.parseInt(line);
		if (num > 0 && num <= 99) {
			switch (num) {
			case 1:
					System.out.println("Goalkeeper");
					break;
			case 3:
			case 4:
			case 5:
					System.out.println("Back");
					break;
			case 6:
			case 8:
			case 11:
					System.out.println("Midfield");
					break;
			case 9:
					System.out.println("Striker");
					break;
			default:
					System.out.println("Polivalent");
					break;
			}
			
			
		}
		else {
			System.out.println("Program ended");
		}
		}
	}
