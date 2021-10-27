package Airtline;

import java.time.LocalDate;
import java.util.ArrayList;

public class Data {
	public ArrayList<Seat> seat;
	public ArrayList<Passenger> passenger;
	public ArrayList<Flight> flight;
	public ArrayList<Ticket> ticket;
	
	public Data() {
		this.seat=new ArrayList<Seat>();
		this.passenger=new ArrayList<Passenger>();
		this.flight=new ArrayList<Flight>();
		this.ticket=new ArrayList<Ticket>();
		
	}

	public ArrayList<Seat> getSeat() {
		return seat;
	}

	public ArrayList<Passenger> getPassenger() {
		return passenger;
	}

	public ArrayList<Flight> getFlight() {
		return flight;
	}

	public ArrayList<Ticket> getTicket() {
		return ticket;
	}
	
	public void addSeat(String seatNumber) {
		
		seat.add(new Seat(seatNumber));
	}
	
	public void addFlight(int flightNum, String departure, String arrive) {
		flight.add(new Flight(flightNum, departure, arrive));
	}
	
	public boolean addPassenger(String passengerName) {
		boolean passengerExist = false;
		
		for (Passenger item : passenger)
		{
			if(passengerName.equals(item.name)){
				passengerExist = true;
		}
             
		}
		if(passengerExist==false){
			
				passenger.add(new Passenger(passengerName));
			
			
			
		}
		  return passengerExist;
	}
	
	public String addTicket(LocalDate flightDate, String passengerName, int flightNum, String seatNum)
	{
		Passenger ticketPassenger = null;
		for(Passenger item: passenger)
		{
			if(passengerName.equals(item.name)){
				ticketPassenger = item;
			}
		}
		Flight ticketFlight = null;
		for(Flight item: getFlight())
		{
			if(flightNum == item.flightNo){
				ticketFlight= item;
			}
		}
		
				Seat ticketSeat = null;
				for(Seat item: seat)
				{
					if(seatNum.equals(item.seat)){
						ticketSeat= item;
					}
				}
	
		Ticket 	paper = new Ticket();
		paper.setFlightDate(flightDate);
		paper.setPassenger(ticketPassenger);
		paper.setFlight(ticketFlight);
		paper.setSeat(ticketSeat);
		
		ticket.add(paper);
		return paper.toString();
	}
	
	public ArrayList<Seat> getOpenSeats( LocalDate departureDate, int flightNumber ){
		ArrayList<Seat> openSeats = getSeat();
		for(Ticket item: getTicket()){
			if(departureDate.equals(item.getFlightDate()) && flightNumber == item.getFlight().getFlightNo()){
				openSeats.remove(item.getSeat());
			}
	   }
       return openSeats;
	}
	

	public void addDetail() {
		addSeat("27C");
		addSeat("11f");
		addSeat("2B");
		addSeat("35D");
		addSeat("3H");
		addSeat("55H");
		addFlight(4379, "Vancouver", "Tokyo");	
		addFlight(2490, "Tronto", "Washington");	
		addFlight(3747, "Osaka", "New York");	
		addFlight(413, "UK", "Brazil");	
	}

}
