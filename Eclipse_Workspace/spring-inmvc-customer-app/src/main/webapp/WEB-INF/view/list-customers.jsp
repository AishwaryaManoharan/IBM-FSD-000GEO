<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<input type="button" value="Add Customer"
		onclick="window.location.href='showFormForAdd'; return false;"
		class="add-button" /><br/><br/>
	<table>
		<tr>
			<th>Id</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Email</th>
		</tr>
		<c:forEach var="tempCustomer" items="${customers}">
				
					<tr>
						<td>${tempCustomer.id}</td>
						<td> ${tempCustomer.firstName} </td>
						<td> ${tempCustomer.lastName} </td>
						<td> ${tempCustomer.email} </td>
						<td><a href="edit?id=${tempCustomer.id}"><button>Edit</button></a></td>
						<td><a href="delete?id=${tempCustomer.id}"><button>Delete</button></a></td>
					</tr>
				
				</c:forEach>
	</table>
</body>
</html>