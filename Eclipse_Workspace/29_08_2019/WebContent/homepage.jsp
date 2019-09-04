<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="action.do" method="post">
<label>Name</label>
<input type="text" name="name" placeholder="Enter name"/>
<br>
<label>Password</label>
<input type="password" name="password" placeholder="Enter password"/>
<br>
<label>Email</label>
<input type="email" name="email" placeholder="Enter email"/>
<br>
<label>Country</label>
<select name="country">
<option value="Unknown">Unknown</option>
<option value="India">India</option>
<option value="Canada">Canada</option>
<option value="Japan">Japan</option>
</select>
<br>
<input type="submit" value="save"/>
</form>
</body>
</html>