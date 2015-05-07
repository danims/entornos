package org.cuatrovientos.average;

/**
 * 
 * 
 * @author Daniel Martin
 * 
 */
import java.util.Scanner;

public class Average {
	public static void main (String [] args) {
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;
		int num5 = 0;
		int average = 0;
		Scanner reader = new Scanner(System.in);
		String line = "";
		
		System.out.println("Enter numer 1: ");
		line = reader.nextLine();
		num1 = Integer.parseInt(line);
		
		System.out.println("Enter numer 2: ");
		line = reader.nextLine();
		num2 = Integer.parseInt(line);
		
		System.out.println("Enter numer 3: ");
		line = reader.nextLine();
		num3 = Integer.parseInt(line);
		
		System.out.println("Enter numer 4: ");
		line = reader.nextLine();
		num4 = Integer.parseInt(line);
		
		System.out.println("Enter numer 5: ");
		line = reader.nextLine();
		num5 = Integer.parseInt(line);
		
		average = (num1 + num2 + num3 + num4 + num5) / 5;
		
		System.out.println("The average is: " + average);
	}
}
