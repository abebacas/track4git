package org.ssglobal.training.codes.B;

public class AdvanceTicket extends Ticket {
	
	// declare needed variables
	private static int dayLimit = 10;
	private static double advancePrice1 = 30.0;
	private static double advancePrice2 = 40.0;
	
	/* constructed with a ticket number and how many days 
	 * in advance the ticket was purchased */
	public AdvanceTicket(int ticketNumber, int daysAdvance) {
		super(ticketNumber);		
			if (daysAdvance < dayLimit) {
				super.ticketPrice = advancePrice2;
			} super.ticketPrice = advancePrice1;
	}
	
	@Override
	public String printTicket() {
		return super.printTicket();
	}

	
}
