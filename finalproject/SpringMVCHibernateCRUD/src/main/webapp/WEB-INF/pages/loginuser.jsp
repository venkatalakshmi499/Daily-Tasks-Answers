<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Login Page</title>
<style>
body
{
background-image:url('https://cdn.dribbble.com/users/1198810/screenshots/6036425/login.png');
background-repeat: no-repeat;
background-size: cover;
}
</style>
</head>
<body>
<form:form action="./registeruser" modelAttribute="employee">
Enter username: <form:input path="name" type="text"/><br>
Enter password:<form:input path="email" type="password"/><br>
<br><br>
<input type="submit" value="login">
<br><br>
<h4>
			New User Register <a href="newEmployee">here</a>
		</h4>
</form:form>

</body>
</html>