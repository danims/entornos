/**
 * 
 */
package org.cuatrovientos.loops;

/**
 * @author PC
 *
 */
public class Loops {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 10;
		
		while (number > 0) {
			System.out.println("LOL");
			number = number - 1;
			
		}
		do {
			System.out.println("RTFM"); // en el do una vez va entrar
			number = number + 1;
		} while (number < 10);
		for (int i = 0; i<10; i++) {
			System.out.println("For " + i);
		}
		//Infinite loops
		//while (true) {
			
		//}
		for (;;) {
			
		}

	}

}
