package Airtline;

public class Passenger {
	public String name;
	
	public Passenger(String name) {
		this.name=name;
	}

	@Override
	public String toString() {
		return "Passenger: " + name ;
	}

	public String getName() {
		return name;
	}

}
