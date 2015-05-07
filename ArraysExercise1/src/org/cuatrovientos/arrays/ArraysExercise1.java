/**
 * 
 */
package org.cuatrovientos.arrays;

/**
 * @author PC
 *
 */
public class ArraysExercise1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] numbers = new int[10];
		int [] otherNumbers = {23,11,0,24,54,666,777,5343,987,10000};
		int num = 1;
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = num;
			num = num + 1;
			System.out.println(i + ": " + numbers[i]);
		}
		for (int i = 0; i < otherNumbers.length; i++) {
			System.out.println(i + ": " + otherNumbers[i]);
		}
	}

}
