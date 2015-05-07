package org.cuatrovientos.highway;

import java.util.Scanner;

/**
 * Main program
 * @author Daniel Martin
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String plate = "";
		String fare = "";
		Vehicle result = null;
		Vehicle vehicles = null;
		
		Scanner reader = new Scanner(System.in);
		String option = "";
		Highway highway = new Highway();
		do {
			System.out.println("------------ Highway to hell --------------");
			System.out.println("Select one option:");
			System.out.println("1. Add new vehicle");
			System.out.println("2. Remove vehicle");
			System.out.println("3. Search one vehicle by plate to show his fare");
			System.out.println("4. Show all vehicles");
			System.out.println("5. Exit");
			option = reader.nextLine();
		
			switch (option) {
				case "1":
					System.out.println("Please, enter plate.");
					plate = reader.nextLine();
					System.out.println("Please, enter fare.");
					fare = reader.nextLine();
					vehicles = new Vehicle(plate,fare);
					highway.addVehicle(vehicles);
					break;
				case "2":
					System.out.println("Please, enter plate.");
					plate = reader.nextLine();
					highway.removeVehicle(plate);
					break;
				case "3":
					System.out.println("Please, enter plate.");
					plate = reader.nextLine();
					result = highway.readPlate(plate);
					if (result != null) {
						System.out.println(result);
					}
					break;
				case "4":
					System.out.println(highway.showAll());
					break;
				case "5":
					System.out.println();
					System.out.println("Closing...");
					break;
				default:
					System.out.println();
					System.out.println("Invalid option");
					break;
				}
		} while (!option.equals("5"));
	}

		
	}
