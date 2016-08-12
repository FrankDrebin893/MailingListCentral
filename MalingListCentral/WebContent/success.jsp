<%@page import="java.awt.print.Printable"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Welcome ${requestScope['user'].username}. 
	<br/>
	Yes hello.
	<br/>
	
	<% ArrayList<String> helloList = new ArrayList<String>();
	helloList.add("Hello");
	helloList.add("world!");
	out.println("THIS IS AN OUT.PRINTLN!");
	out.println();
	for(String value : helloList) { 
		out.println(value);
	 } %>
	 
	<c:forEach items="helloList" var="item" >
	   <c:out value="${item}" />
	</c:forEach>
</body>
</html>