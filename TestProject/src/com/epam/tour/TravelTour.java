/**
 * Basic class for travel types
 */
package com.epam.tour;

import java.util.Date;

/**
 * @author Administrator
 *
 */
public class TravelTour {

	/**
	 * 
	 */
	private String tourName;
	private String diraction;
	private String supplyType;
	private String vehicleType;
	private Date startDate;
	private String bookRoom;
	private int tourDuration;
	
	public TravelTour(){					
	}
	
	protected TravelTour(String name, String supply, String vehicle, int duration, Date start, String booking){
		setTourName(name);
		this.setSupplyType(supply);
		this.vehicleType = vehicle;
		this.tourDuration = duration;
		this.startDate = start;			
		this.bookRoom = booking;			
	}
	
	public String getTourName() {
		return tourName;
	}

	public void setTourName(String tourName) {
		this.tourName = tourName;
	}

	public String getDiraction() {
		return diraction;
	}

	public void setDiraction(String diraction) {
		this.diraction = diraction;
	}

	public String getSupplyType() {
		return supplyType;
	}

	public void setSupplyType(String supplyType) {
		this.supplyType = supplyType;
	}

}
