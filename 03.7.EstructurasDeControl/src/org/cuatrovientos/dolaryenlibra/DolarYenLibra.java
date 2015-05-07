/**
 * 
 */
package org.cuatrovientos.dolaryenlibra;

import java.util.Scanner;

/**
 * @author PC
 *
 */
public class DolarYenLibra {

	private static final float EUROTODOLAR = 1.26f;
	private static final float EUROTOYEN = 135.91f;
	private static final float EUROTOLIBRA = 0.787f;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float euro = 0;
		String money = "";
		String line = "";
		Scanner reader = new Scanner(System.in);
		
		System.out.println("How much money you want to convert?");
		line = reader.nextLine();
		euro = Float.parseFloat(line);
		System.out.println("Into what type do you want to convert? (D/Y/L)");
		line = reader.nextLine();
		money = line;
		switch(money) {
		case "d":
			System.out.println("Euro to dolar:" + euro * EUROTODOLAR);
			break;
		case "y":
			System.out.println("Euro to yen:" + euro * EUROTOYEN);
			break;
		case "l":
			System.out.println("Euro to libra:" + euro * EUROTOLIBRA);
			break;
		default:
			System.out.println("Error");
			break;
		}
		
		
		

	}

}
