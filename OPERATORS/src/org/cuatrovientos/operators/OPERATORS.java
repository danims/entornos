package org.cuatrovientos.operators;

/**
 * Simple class to make use of operators
 * @author Daniel Martin
 *
 */

public class OPERATORS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		int b = 0;
		int result = 0;
		// Operators: + - * / % 
		result = a + b;
		result = a + 42;
		result = 10 / (2 - b);
		result = 10 / 3;
		result = 10 % 3; // Devuelve el resto de la division
		System.out.println(result);
		result = -result; // To negative
		result = a + 1;
		result = a++; // Suma uno
		a = 5;
		a = a + 1;
		System.out.println("a is " + a);
		a++;
		System.out.println("a is " + a);
		a--;
		System.out.println("a is " + a);
		
		// Equivalents
		a = a + 5;
		a += 5; // += -= *= /= %=
		
		
		
	}

}
