/**
 * 
 */
package org.cuatrovientos.highway;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 * Represent the highway with vehicles
 * @author Daniel Martin
 *
 */
public class Highway {
	
	private Hashtable<String,Vehicle> Vehicles;

	
	/**
	 * Default constructor
	 */
	public Highway() {
		Vehicles = new Hashtable<String,Vehicle>();
	}

	/**
	 * adds vehicle in the highway
	 * @param entry
	 */
	public void addVehicle (Vehicle vehicle) {
		Vehicles.put(vehicle.getPlate(), vehicle);
	}
	
	/**
	 * removes vehicle from the highway
	 * @param plate
	 * @return if vehicle was successfully removed or not
	 */
	public void removeVehicle(String plate) {
		Vehicles.remove(plate);
	}
	/**
	 * shows one vehicle in the highway
	 * @param plate
	 * @return vehicle referenced by plate, null otherwise
	 */
	public Vehicle readPlate(String plate) {
		Vehicle vehicle = null;
		
		vehicle = Vehicles.get(plate);
		
		return vehicle;
	}
	/**
	 * shows all vehicles in highway
	 * @return
	 */
	public String showAll() {
		String allVehicles = "";
		Enumeration<String> keys = Vehicles.keys();
		
		while (keys.hasMoreElements()) {
			String plate = keys.nextElement();
			allVehicles = allVehicles + Vehicles.get(plate).toString() + "\n";
		}
		
		return allVehicles;
	} 
}
