package org.cuatrovientos.exam;

import java.util.Random;
import java.util.Scanner;
/**
 *
 */
public class RandomArray {
	
	public static void showArray(int[] numbers) {
		for (int i = 0;i<9;i++) {
		System.out.println(numbers[i] + " ");
		}
		
		
	}
	public static void initRandom(int[] numbers) {
		Random r = new Random();
		for (int i = 0;i<9;i++) {
			numbers[i] = r.nextInt(50);
			
		}
	}
	public static int[] getPositives(int[] numbers) {
		for (int i = 0;i<9;i++) {
			if (numbers[i] > 0) {
				System.out.println(numbers[i] + " ");
			}
		}
		return numbers;
	}
	public static void summary(int[] numbers) {
		
	}
		
	/**
	 * main method
	 * @param args
	 */
	public static void main(String args[]) {
		int [] numbers = new int[10];
		int option = 0;
		String line = "";
		Scanner reader = new Scanner(System.in);
		do {
		System.out.println("1. Show elements of the array");
		System.out.println("2. Initiate the array with random numbers");
		System.out.println("3. Show only odd numbers");
		System.out.println("4. Summary");
		System.out.println("5. Exit");
		
		line = reader.nextLine();
		option = Integer.parseInt(line);
		switch (option) {
		case 1:
			showArray(numbers);
			break;
		case 2:
			initRandom(numbers);
			break;
		case 3:
			getPositives(numbers);
			break;
		case 4:
			summary(numbers);
			break;
		case 5:
			break;
		default:
			System.out.println("Enter a correct option");
			break;
			
		}
			
		} while(option != 5);
		

	}


}
