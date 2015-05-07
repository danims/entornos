package org.cuatrovientos.oop;

/**
 * Represent a student
 * @author PC
 *
 */
public class Student extends Person{
	private String school;
	
	public Student () {
		school = "Cuatroviento High School";
	}
	/**
	 * learns
	 */
	public void learn () {
		System.out.println("I'm learning");
		
	}
	

}
