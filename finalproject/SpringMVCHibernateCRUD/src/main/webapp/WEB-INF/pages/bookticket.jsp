<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>book flights here </title>
<style>
body { 
  background-image: url('data:image/png;base64,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');
  background-repeat: no-repeat;
  background-attachment: fixed;
  background-position: center; 
}
 #type
{
      width: 300px;
	  height:32px;
	  
	  border:0;
	  outline:0;
	  background:transparent;
	  border-bottom:3px solid white;
	  color:white;
	  font-size:25px;
  }
  
</style>

</head>
<body>
<form:form action="./some" modelAttribute="BookTickets">
   <table align="center">   
	
	<thead colspan="2">
					<th style="color:black"><h1>Search for the Availability</h1></th>
				<tr>
					<td><label>To:</label></td>
					<td><input type="text" name="Username"></td>
				</tr>
				<tr>
					<td><label>From:</label></td>
					<td><input type="text" name="Username"></td>
				</tr>
				<td><label>Date of Journey:</label></td>
					<td><input type="date" name="Username"></td>
           <tr>
		   <td><br>
               <form action="./some" method="get">
		<input type="submit" value="Check Availability">
		</form>
		
                                        <td><br><a href="./BookTickets"></a></td>
                             </tr>
                             </thead>
                             </table>
                             
   </form:form>
</body>
</html>