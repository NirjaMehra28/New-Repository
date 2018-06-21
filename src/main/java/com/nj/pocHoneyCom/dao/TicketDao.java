package com.nj.pocHoneyCom.dao;

import com.nj.pocHoneyCom.entity.Customer;
import com.nj.pocHoneyCom.entity.TicketDetails;

public interface TicketDao {

    public String createTicket( TicketDetails ticket);
	
	public Customer updateTicket(TicketDetails ticket);
	
	public TicketDetails showAllTickets(String cust_id);
	
	public TicketDetails viewTicket(String ticket_id);
	

}
