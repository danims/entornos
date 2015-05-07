package org.cuatrovientos.highway;

/**
 * Represents a vehicle in the highway
 * @author Daniel Martin
 *
 */
public class Vehicle {
	
	private String plate;
	private String fare;
	
	/**
	 * @param plate
	 * @param fare
	 */
	public Vehicle(String plate, String fare) {
		this.plate = plate;
		this.fare = fare;
		
	}

	/**
	 * @return the plate
	 */
	public String getPlate() {
		return plate;
	}

	/**
	 * @param plate the plate to set
	 */
	public void setPlate(String plate) {
		this.plate = plate;
	}

	/**
	 * @return the fare
	 */
	public String getFare() {
		return fare;
	}

	/**
	 * @param fare the fare to set
	 */
	public void setFare(String fare) {
		this.fare = fare;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Vehicle [plate=" + plate + ", fare=" + fare + "]";
	}
	
	
	
}
