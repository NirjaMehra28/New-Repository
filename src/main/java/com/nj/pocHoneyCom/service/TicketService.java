package com.nj.pocHoneyCom.service;

import java.util.List;

import com.nj.pocHoneyCom.entity.Customer;
import com.nj.pocHoneyCom.entity.TicketDetails;

public interface TicketService {

	    public String createTicket( TicketDetails ticket);
		
		public String updateTicket(TicketDetails ticket);
		
		public List<TicketDetails> showAllTickets(String cust_id);
		
		public TicketDetails viewTicket(String ticket_id);
		

}
