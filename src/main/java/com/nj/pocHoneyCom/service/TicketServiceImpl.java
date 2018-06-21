package com.nj.pocHoneyCom.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nj.pocHoneyCom.dao.TicketDao;
import com.nj.pocHoneyCom.entity.TicketDetails;

@Service
public class TicketServiceImpl implements TicketService{

	@Autowired
	TicketDao ticketdao;
	
	@Override
	public String createTicket(TicketDetails ticket) {

      return ticketdao.createTicket(ticket);
	}

	@Override
	public String updateTicket(TicketDetails ticket) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TicketDetails> showAllTickets(String cust_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TicketDetails viewTicket(String ticket_id) {
		// TODO Auto-generated method stub
		return null;
	}

}
