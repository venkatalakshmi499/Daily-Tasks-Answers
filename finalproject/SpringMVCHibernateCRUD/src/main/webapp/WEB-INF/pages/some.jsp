<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display </title>
		<script>
            function confirmGo(m,u) {
                if ( confirm(m) ) {
                    window.location = u;
                }
            }
        </script>
</head>
<body>
<sql:setDataSource var="dbsource" driver="com.mysql.cj.jdbc.Driver"
                           url="jdbc:mysql://localhost:3306/hcldb"
                           user="root"  password="Venky@499"/>
                           
          <sql:query dataSource="${dbsource}" var="result">
            SELECT * from flight_list;
        </sql:query>
       <center>
        <form>
            <table border="1" width="40%">
                <caption>Flights List</caption>
                <tr>
                    <th>Flight Id</th>
                    <th>Source</th>
                    <th>Destination</th>
                     <th>Flight Name</th>
                     <th>Flight Start time</th>
                      <th>Destination time</th>
                      <th>Price</th>
                      
                    <th colspan="1">Action</th>
                </tr>
                <c:forEach var="row" items="${result.rows}">
                    <tr>
                        <td><c:out value="${row.flightID}"/></td>
                        <td><c:out value="${row.source}"/></td>
                        <td><c:out value="${row.destination}"/></td>
                        <td><c:out value="${row.flightName}"/></td>
                        <td><c:out value="${row.startDateTime}"/></td>
                        <td><c:out value="${row.endDateTime}"/></td>
                        <td><c:out value="${row.price}"/></td>
      					 <form action="./flightsuccess" method="get">
						<td><a href="flightsuccess">bookflight</a></td>
						</form>
                         
                    </tr>
                </c:forEach>
            </table>
        </form>
        <a href="index.jsp">Go Home</a>
    </center>
</body>
</html>