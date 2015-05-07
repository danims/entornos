package org.cuatrovientos.moneda;

import java.util.Random;

public class Moneda {
	private String Heads = "Head";
	private String Tails = "Tail";
	/**
	 * Es un constructor
	 */
	public Moneda () {
		System.out.println("New instance of coin");
	}
	/**
	 * Flips a coin
	 */
	public void Flip () {
		Random rnd = new Random();
		if (rnd.nextInt(2) == 1) {
		System.out.println(Heads);
		} else {
		System.out.println(Tails);
		}
		
	}
	public static void main(String[] args) {
		Moneda myFlip = new Moneda();
		myFlip.Flip();

	}

}
