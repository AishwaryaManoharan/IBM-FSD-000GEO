<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	First Name : ${tempStudent.firstName}
	Last Name : ${tempStudent.lastName}
	Country : ${tempStudent.country}
	Favorite Language : $(tempStudent.favLang)
<%-- 	Operating systems : ${tempStudent.operatingSystems } --%>
</body>
</html>