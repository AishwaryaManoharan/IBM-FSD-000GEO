<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="processForm" modelAttribute="student">
		<label for="input-1">First Name</label>
		<form:input path="firstName"/><br/><br/>
			<label for="input-2">Last Name</label>
		<form:input path="lastName"/><br/><br/>
		Country : 
		<form:select path="country">
			<form:options items="${student.countryOptions}"/>
		</form:select><br/><br/>
		
		Your favorite programming language :
		C<form:radiobutton path="favLang" value="C"/>
		Java<form:radiobutton path="favLang" value="Java"/>
		C#<form:radiobutton path="favLang" value="C#"/><br/><br/>
		
		<input type="submit"/>
		
<!-- Operating Systems: -->

<%-- Linux <form:checkbox path="operatingSystems" value="Linux"/> --%>
<%-- MAC OS<form:checkbox path="operatingSystems" value="MAC"/> --%>
<%-- Windows <form:checkbox path="operatingSystems" value="Windows"/> --%>
<!-- <br/> -->
<!-- <br/> -->

<!-- <input type="submit" value="Submit"> -->
</form:form>



</body>
</html>