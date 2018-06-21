<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page session="false"%>
<html>
<head>
<title>Welcome - Login Page</title>
<style>
    .error
    {
        color: #ff0000;
        font-weight: bold;
    }
    </style>
</head>
<body>
	    <h2><spring:message code="lbl.page" text="Welcome to Login Screen" /></h2>
	
	<P>The time on the server is ${serverTime}.</p>

	
	<table>
	<tr><td>
		<form action="loginPage" method="post" modelAttribute="login_details">
			<table style="with: 50%">
				<tr>
					<td><spring:message code="lbl.userName" text="User Name" /></td>
					<td><input type="text" name="user_Name" /></td>
					<td><form:errors path="user_Name" cssClass="error" /></td>
				</tr>
				<tr>
					<td><spring:message code="lbl.password" text="Password" /></td>
					<td><input type="password" name="Password" /></td>
					<td><form:errors path="Password" cssClass="error" /></td>
				</tr>
				 <tr>
		 	<td>		
			&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 
			<input type="submit" name="openCustomer" value="Login" />
			</td>
			<td>		
			&nbsp; &nbsp; 
			<input type="submit" name="openRegister" value="Register" />
			</td>
			</tr>	
				
			</table>
			</form>
		 </td>
		 </tr>
		
		
		</table>
			
			
</body>
</html>