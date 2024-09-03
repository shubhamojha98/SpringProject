<%@page import="com.springboot.hb.model.Employee"%>
<%@page import="com.fasterxml.jackson.databind.deser.impl.CreatorCandidate.Param"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%Iterable<Employee> list=(Iterable)request.getAttribute("list");%>

<table border="2px">
<tr><td></td><td></td><td></td><td></td><td></td><td></td></tr>
<%
for(Employee emp : list){%>
<tr>
	<td><%=emp.getId()%></td>
	<td><%=emp.getName()%></td>
	<td><%=emp.getAge()%></td>
	<td><%=emp.getCity()%></td>
	<td><%=emp.getPost()%></td>
	<td><%=emp.getSalary()%></td>
</tr>
<%}%>
</table>
</body>
</html>