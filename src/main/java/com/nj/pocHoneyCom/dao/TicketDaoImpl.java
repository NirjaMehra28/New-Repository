package com.nj.pocHoneyCom.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nj.pocHoneyCom.entity.Customer;
import com.nj.pocHoneyCom.entity.TicketDetails;

@Repository
public class TicketDaoImpl implements TicketDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public String createTicket(TicketDetails ticket) {
		// TODO Auto-generated method stub
		System.out.println("in createTicket " + ticket);
		String msg = null;
		Session session = sessionFactory.getCurrentSession();
		Transaction tx = session.beginTransaction();
		if(ticket !=null)
		{
			try {
				session.save(ticket);
				tx.commit();
				msg = "Success";
				session.close();
			} catch (Exception e) {
				
				tx.rollback();
				msg = "Fail";
				session.close();
				e.printStackTrace();
			}
		
		}
		return msg;
	}

	@Override
	public Customer updateTicket(TicketDetails ticket) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TicketDetails showAllTickets(String cust_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TicketDetails viewTicket(String ticket_id) {
		// TODO Auto-generated method stub
		return null;
	}

}
