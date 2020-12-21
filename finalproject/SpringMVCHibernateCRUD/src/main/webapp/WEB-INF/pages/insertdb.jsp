<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<sql:setDataSource var="dbsource" driver="com.mysql.cj.jdbc.Driver"
                           url="jdbc:mysql://localhost:3306/hcldb"
                           user="root"  password="Venky@499"/>
                           
            <sql:update dataSource="${dbsource}" var="result">
                           
            INSERT INTO flight_list(flightID,source,destination,flightName,startDateTime,endDateTime,price) VALUES (?,?,?,?,?,?,?);
            <sql:param value="${param.flightID}" />
            <sql:param value="${param.source}" />
            <sql:param value="${param.destination}" />
            <sql:param value="${param.flightName}" />
            <sql:param value="${param.startDateTime}" />
            <sql:param value="${param.endDateTime}" />
            <sql:param value="${param.price}" />
        
        </sql:update>
       
            <p> Congratulations ! Data inserted
            successfully.</p>
</body>
</html>