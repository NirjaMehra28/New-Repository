<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
</head>
<body>
	<h1> <ul> Register Yourself </ul> </h1>
	
	
	
	<table>
	<tr><td>
		<form action="registerNewUser" method="post" modelAttribute="login_details">
			<table style="with: 50%">
				<tr>
					<td>User Name</td>
					<td><input type="text" name="user_Name" /></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="Password" /></td>
				</tr>
				
				 <tr>
					<td>User_Role</td>
					<td>
					<select name="User_Role">
					  <option value="employee">Employee</option>
					  <option value="manager">Manager</option>
					  <option value="admin">Admin</option>
					</select>
				   </td>	
				</tr>
				<tr>
					<td>Email Id</td>
					<td><input type="email" name="Email_Id" /></td>
				</tr></table> 
			<input type="submit" value="Register" /></form>
			</td>
		</tr>
		
		</table>
			
			
</body>
</html>