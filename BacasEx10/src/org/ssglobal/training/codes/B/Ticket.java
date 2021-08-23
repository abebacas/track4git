package org.ssglobal.training.codes.B;

public class Ticket {

	private int ticketNumber;
	public double ticketPrice;
	
	// construct a ticket by number
	public Ticket(int ticketNumber) {
		this.ticketNumber = ticketNumber;
	}
	
	// ask for a ticket's price
	public double getPrice() {
		return ticketPrice;
	}
	
	// print a ticket object as a String
	public String printTicket() {
		return String.format("Number: %d, Price: %.1f\n", 
							  ticketNumber, ticketPrice);
	}
	
}