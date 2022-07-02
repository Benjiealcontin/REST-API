<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import ="java.util.*" %>
<%@page import = "com.operation.Model.Model" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
List<Model> dataList = (List<Model>)request.getAttribute("data");
for(int i = 0; i<dataList.size(); i++){
%>	
<h1>databyId and Firstname</h1>
<li><%out.print(dataList.get(i).getFirstname()); %></li>
<li><%out.print(dataList.get(i).getLastname()); %></li>
<li><%out.print(dataList.get(i).getAge()); %></li>
<%} %>


</body>
</html>