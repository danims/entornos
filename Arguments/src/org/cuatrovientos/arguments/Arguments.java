/**
 * 
 */
package org.cuatrovientos.arguments;

/**
 * @author PC
 *
 */
public class Arguments {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length == 2) {
		String argument1 = args[0];
		int argument2 = Integer.parseInt(args[1]);
		
		System.out.println("First arg: " + argument1);
		System.out.println("Second arg: " + argument2);
		
		for (int i = 0; i < argument2; i++) {
			System.out.print(argument1);
		}
		}
	}

}
	
