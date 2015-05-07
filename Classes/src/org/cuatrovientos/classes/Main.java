/**
 * 
 */
package org.cuatrovientos.classes;

/**
 * @author PC
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int counter = 0;
		Customer oneCustomer;
		Customer anotherCustomer;
		
		oneCustomer = new Customer();
		oneCustomer.setName("Ainhoa");
		
		oneCustomer.sayHello();
		anotherCustomer = oneCustomer;
		

	}

}
