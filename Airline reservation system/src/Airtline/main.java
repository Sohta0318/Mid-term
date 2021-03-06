package Airtline;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class main {


	public static void main(String[] args) {
		Data data = new Data();
		data.addDetail();

		String passengerName = null;
		int flightNumber = 0;
		String seatNumber = null;
		LocalDate flightDate = LocalDate.now();
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		
		while(true)
		{
			
			System.out.println("Enter Your Name: ");
	
				passengerName = scanner.next();
//				System.out.println(passengerName.getClass().getSimpleName());
			
			boolean result = data.addPassenger(passengerName);


			if(result)
			{
				System.out.println("Welcome back: " +  passengerName);
				String ticketInfo = data.addTicket(flightDate, passengerName, flightNumber, seatNumber);
				System.out.println("\nHere is your reservation");
				System.out.println(ticketInfo + "\n");
				return;
			}
			else{
				System.out.println("Welcome: " +  passengerName);
			}
	
			System.out.println("\nHere are today's flights: ");
			for(Flight item: data.getFlight()){
				System.out.println(item);
			}
			System.out.println("Enter the flight number");
			try{

				flightNumber = scanner.nextInt();
			} catch (Exception e) {
				System.out.println("Please enter flight number");
		}
		

			
			System.out.println("Here are seats on that flight: ");
			ArrayList<Seat> openSeats = data.getOpenSeats(flightDate, flightNumber);
			for(Seat item: openSeats){
				System.out.print(item.getSeat() + ",");
			}
			System.out.println("\nEnter the seat number you want: ");
			
				seatNumber = scanner.next();
		
			String ticketInfo = data.addTicket(flightDate, passengerName, flightNumber, seatNumber);
			System.out.println("\nReservations are completed!! Here is ticket detail");
			System.out.println(ticketInfo + "\n");
		}

	}

}
