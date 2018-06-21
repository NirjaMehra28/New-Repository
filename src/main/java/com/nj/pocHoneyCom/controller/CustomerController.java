package com.nj.pocHoneyCom.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;

import com.nj.pocHoneyCom.entity.Customer;
import com.nj.pocHoneyCom.entity.TicketDetails;
import com.nj.pocHoneyCom.service.CustomerService;
import com.nj.pocHoneyCom.service.TicketService;

@Controller

public class CustomerController {

	@Autowired
	CustomerService customerService;
	
	@Autowired
	TicketService ticketService;
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
	    SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
	    sdf.setLenient(true);
	    binder.registerCustomEditor(Date.class, new CustomDateEditor(sdf, true));
	}
	
	@RequestMapping(value="/enterCustomerDetails", method= RequestMethod.GET)
	public String openCustomerPage()
	{
		return "customer";
	}
	
	@RequestMapping(value="/saveCustomer", method= RequestMethod.POST)
	public String saveCustomer(@ModelAttribute("customer") Customer customer,BindingResult result)
	{
		System.out.println(" in saveCustomer");
		System.out.println(customer);
		customerService.saveCustomer(customer);
		return "customerMainScreen";
	}
	
	@RequestMapping(value="/raiseTicket", method= RequestMethod.POST)
	public String raiseTicket(@ModelAttribute("ticket_details") TicketDetails ticket,BindingResult result,SessionStatus status)
	{
		System.out.println(" in raiseTicket");
		System.out.println(ticket);
		String msg = ticketService.createTicket(ticket);
		System.out.println("Raising Ticket in DB :: "+ msg);
		return "customerMainScreen";
	}
	
	@RequestMapping(value="/openRaiseTicket", method= RequestMethod.GET)
	public String openRaiseTicketPage(@ModelAttribute("ticket_details") TicketDetails ticket)
	{
		return "raiseTicket";
	}
}
