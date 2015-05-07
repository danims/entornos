package org.cuatrovientos.hola;

public class Hola {
	
	private String greet = "Hello";

	/**
	 * Says hello on console
	 */
	public void sayHello () {
		System.out.println(greet);
	}
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Hola myHello = new Hola();
		myHello.sayHello();

	}

}
