package Airtline;

import java.time.LocalDate;

public class Ticket {
	public LocalDate flightDate;
	public Flight flight;
	public Passenger passenger;
	public Seat seat;
	
	public  Ticket() {
		this.flightDate= LocalDate.now();
		
	}

	public LocalDate getFlightDate() {
		return flightDate;
	}

	public Flight getFlight() {
		return flight;
	}

	public Passenger getPassenger() {
		return passenger;
	}

	public Seat getSeat() {
		return seat;
	}

	@Override
	public String toString() {
		return "Ticket: " + passenger + " flight Number " + this.getFlight().flightNo + " from " + this.flight.departure + " to " + this.getFlight().arrive + " on " + flightDate + seat 
				;
	}

	public void setFlightDate(LocalDate flightDate) {
		this.flightDate = flightDate;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}

	public void setSeat(Seat seat) {
		this.seat = seat;
	}

}
