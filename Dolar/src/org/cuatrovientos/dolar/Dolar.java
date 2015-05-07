package org.cuatrovientos.dolar;

import java.util.Scanner;

/**
 * 
 * @author Daniel Martin
 *
 */

public class Dolar {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double dolar = 0;
		double result = 0;
		double dolarToEuro = 0.79;
		
		Scanner reader = new Scanner(System.in);
		String line = "";
		
		System.out.println("Enter numer of dolars: ");
		line = reader.nextLine();
		dolar = Double.parseDouble(line);
		result = (dolar * dolarToEuro);
		System.out.println("Dolars in Euros: " + result);
		

	}

}
