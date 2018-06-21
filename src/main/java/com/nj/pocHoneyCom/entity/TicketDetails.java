package com.nj.pocHoneyCom.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ticket_details")
public class TicketDetails {

	@Id
	@GeneratedValue
	@Column(name = "ticket_id", length = 11 )

	private String ticket_id;
	
	@Column(name = "created_by", length = 100, nullable = false)
	private String created_by;
	
	@Column(name = "created_on", nullable = false)
	private Date created_on;
	
	@Column(name = "severity", nullable = false)
	private String severity;
	
	@Column(name = "issue_cat", nullable = false)
	private String issue_cat;
	
	@Column(name = "issue_sub_cat")
	private String issue_sub_cat;
	
	@Column(name = "comments", length = 500)
	private String comments;
	
	@Column(name = "ticket_status")
	private String ticket_status;
	
	public TicketDetails() {
		
	}
	public TicketDetails(String ticket_id, String created_by, Date created_on, String severity, String issue_cat,
			String issue_sub_cat, String comments, String ticket_status) {
		super();
		this.ticket_id = ticket_id;
		this.created_by = created_by;
		this.created_on = created_on;
		this.severity = severity;
		this.issue_cat = issue_cat;
		this.issue_sub_cat = issue_sub_cat;
		this.comments = comments;
		this.ticket_status = ticket_status;
	}
	public String getTicket_id() {
		return ticket_id;
	}
	public void setTicket_id(String ticket_id) {
		this.ticket_id = ticket_id;
	}
	public String getCreated_by() {
		return created_by;
	}
	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}
	public Date getCreated_on() {
		return created_on;
	}
	public void setCreated_on(Date created_on) {
		this.created_on = created_on;
	}
	public String getServerity() {
		return severity;
	}
	public void setSeverity(String severity) {
		this.severity = severity;
	}
	public String getIssue_cat() {
		return issue_cat;
	}
	public void setIssue_cat(String issue_cat) {
		this.issue_cat = issue_cat;
	}
	public String getIssue_sub_cat() {
		return issue_sub_cat;
	}
	public void setIssue_sub_cat(String issue_sub_cat) {
		this.issue_sub_cat = issue_sub_cat;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public String getTicket_status() {
		return ticket_status;
	}
	public void setTicket_status(String ticket_status) {
		this.ticket_status = ticket_status;
	}
	
	
}
