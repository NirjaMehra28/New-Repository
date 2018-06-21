<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
</head>
<body>
	
	 <h4 style="font-weight: bolder;">Raise New Ticket</h4>
                  <p><center>We are dedicated to resolve your issues.</center> </p>
	
	
	<table>
	<tr><td>
		<form action="raiseTicket" method="post" modelAttribute="ticket_details">
			<table style="with: 50%">
				<tr>
					<td>Your Id</td>
					<td><input type="text" name="created_by" /></td>
				</tr>
				<tr>
					<td>Created On</td>
					<td><input type="date" name="created_on" /></td>
				</tr>
				
				 <tr>
					<td>Severity</td>
					<td>
					<select name=severity>
					  <option value="High">High</option>
					  <option value="Low">Low</option>
					  <option value="Critical">Critical</option>
					</select>
				   </td>	
				</tr>
				 <tr>
					<td>issue_cat</td>
					<td>
					<select name=issue_cat>
					  <option value="Works">Works</option>
					  <option value="Maintenance">Maintenance</option>
					  <option value="Electircity">Electircity</option>
					</select>
				   </td>	
				</tr>
			 <tr>
					<td>issue_sub_cat</td>
					<td>
					<select name=issue_sub_cat>
					  <option value="Works">Works</option>
					  <option value="Maintenance">Maintenance</option>
					  <option value="Electircity">Electircity</option>
					</select>
				   </td>	
				</tr>
				
				<tr>
					<td>Additional Comments</td>
					<td><input type="text" name="comments" /></td>
				</tr>
				 <tr>
					<td>Ticket Status</td>
					<td>
					<select name=ticket_status>
					  <option value="open">Open</option>
					  <option value="close">Close</option>
					  <option value="In Process">In Process</option>
					</select>
				   </td>	
				</tr>
				
				
				
				
				</table> 
			<input type="submit" value="Ticket" />
			
			</form>
		</td>
		</tr>
		
		</table>
			
			
</body>
</html>