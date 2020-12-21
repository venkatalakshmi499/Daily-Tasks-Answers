<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="./insertdb" method="post">
    <table border="0" cellspacing="2" cellpadding="5">
          <thead>
               <tr>
                 <th colspan="2">Add Flight</th>
                </tr>
                </thead>
                <tbody>
                    <tr>
                  <td><label>Flight Id:</label></td>
                  <td><input type="text" name="flightID"/></td>
                    </tr>
                     <tr>
             	<td><label>Source :</label></td>
             	 <td><input type="text" name="source"/></td>
                    </tr>
                     <tr>
            	 <td><label>Destination :</label></td>
              	<td><input type="text" name="destination"/></td>
                    </tr>
                    <tr>
             	<td><label>Flight Name:</label></td>
             	 <td><input type="text" name="flightName"/></td>
                    </tr>
                    <tr>
             	<td><label>Flight Start time:</label></td>
             	 <td><input type="text" name="startDateTime"/></td>
                    </tr>
                    <tr>
             	<td><label>Destination time:</label></td>
             	 <td><input type="text" name="endDateTime"/></td>
                    </tr>
                     <tr>
             	<td><label>Price:</label></td>
             	 <td><input type="text" name="price"/></td>
                    </tr>
                   <form action="./insertdb" method="get">
                    <tr>
              <td><input type="submit" value="Save" /></td>
              </form>
              
                </tbody>
            </table>
        </form>
    <font color="red"><c:if test="${not empty param.errMsg}">
            <c:out value="${param.errMsg}" />
            <a href="index.jsp">Go Back</a>
        </c:if></font>
   <font color="green"><c:if test="${not empty param.susMsg}">
            <c:out value="${param.susMsg}" />
            <a href="index.jsp">Go Back</a>
        </c:if></font>
</body>
</html>