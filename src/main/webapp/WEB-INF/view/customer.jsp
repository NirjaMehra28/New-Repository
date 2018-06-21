<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
</head>
<body>
	<h1> <ul> Please Add Your Details  !!!! </ul> </h1>
	
	
	
	<table>
	<tr><td>
		<form action="saveCustomer" method="post" modelAttribute="customer">
			<table style="with: 50%">
				<tr>
					<td>First Name</td>
					<td><input type="text" name="Cust_First_Name " /></td>
				</tr>
				<tr>
					<td>Last Name</td>
					<td><input type="text" name="Cust_Last_Name" /></td>
				</tr>
				<tr>
					<td>City</td>
					<td><input type="text" name="Cust_City" /></td>
				</tr>
				<tr>
					<td>Country</td>
					<td><input type="text" name="Cust_Country" /></td>
				</tr>
				<tr>
					<td>Address</td>
					<td><input type="text" name="Cust_Address" /></td>
				</tr>
				<tr>
					<td>Email</td>
					<td><input type="email" name="Cust_Email" /></td>
				</tr>
				
				<tr>
					<td>Phone Number</td>
					<td><input type="text" name="Cust_Phone_No" /></td>
				</tr>
				<tr>
					<td>Mobile Number</td>
					<td><input type="text" name="Cust_Mobile_No" /></td>
				</tr>
				
				 <tr>
					<td>Contract_Type</td>
					<td>
					<select name="Contract_Type">
					  <option value="1_year">1 Year</option>
					  <option value="2_Year">2 Year</option>
					  <option value="Life_Time">LifeTime</option>
					</select>
				   </td>	
				</tr>
				<tr>
					<td>Contract Start Date</td>
					<td><input type="date" name="Contract_Start_Date" /></td>
				</tr>
					<td>Contract End Date</td>
					<td><input type="date" name="Contract_End_Date" /></td>
				</tr>
				<tr>
					<td>Your Id</td>
					<td><input type="text" name="Created_By" /></td>
				</tr></table> 
			<input type="submit" value="Save Details" /></form>
			</td>
		</tr>
		
		</table>
			
			
</body>
</html>