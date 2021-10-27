package Airtline;

public class Flight {
	
	public int flightNo;
	public String departure;
	public String arrive;
	
	public  Flight( int flightNo,String arrive, String departure) {
		this.arrive=arrive;
		this.departure=departure;
		this.flightNo=flightNo;
		
	}
	@Override
	public String toString() {
		return "Flight: " + flightNo + ", departure: " + departure + ", arrive: " + arrive ;
	}
	public int getFlightNo() {
		return flightNo;
	}
	
	public String getDeparture() {
		return departure;
	}
	
	public String getArrive() {
		return arrive;
	}
	
}
