/**
 * 
 */
package org.cuatrovientos.arrays;

/**
 * @author PC
 *
 */
public class Arrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] numbers = new int[5];
		int [] otherNumbers = {42,15,666};
		
		numbers[0] = 0;
		numbers[1] = 42;
		System.out.println(otherNumbers[2]);
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = 0;
			
		}
		
		numbers[0] = 56;
		numbers[4] = numbers[0] + 610;
	}

}
