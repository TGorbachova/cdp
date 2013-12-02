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
	protected String tourName;
	protected String diraction;
	protected String supplyType;
	protected String vehicleType;
	protected Date startDate;
	protected String bookRoom;
	protected int tourDuration;
	
	public TravelTour(){					
	}
	
	protected TravelTour(String name, String supply, String vehicle, int duration, Date start, String booking){
		setTourName(name);
		this.supplyType = supply;
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

}
