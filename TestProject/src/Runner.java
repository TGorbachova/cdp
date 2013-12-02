import java.util.Date;

public class Runner {
	private String tourName;
	private String supplyType;
	private String vehicleType;
	private Date startDate;
	private String bookRoom;
	private int tourDuration;
	
	

	public Runner(){		
		}
	public Runner(String name, String supply, String vehicle, int duration, Date start, String booking){
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
