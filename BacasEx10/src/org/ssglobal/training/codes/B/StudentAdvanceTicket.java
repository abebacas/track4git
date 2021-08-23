package org.ssglobal.training.codes.B;

public class StudentAdvanceTicket extends AdvanceTicket {

	/* constructed with a ticket number and how many days in
	 * advance the ticket was purchased by a student */
	public StudentAdvanceTicket(int ticketNumber, int daysAdvance) {
		super(ticketNumber, daysAdvance);
			super.ticketPrice = super.getPrice() / 2;
	}
	
	@Override
	public String printTicket() {
		return super.printTicket() + "(ID Required)";
	}
}
