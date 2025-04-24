<!-- write a  program in JSP where two input values are taken
 from user and pass those values in a  function to find sum
  of values and display the result using expression tag -->


<html>
<head>
<title>JSP Program to Find Sum of Two Numbers</title>
</head>
<body>

<h2>JSP Program to Find Sum of Two Numbers</h2>

<form action="sum.jsp">
<input type="text" name="num1" placeholder="Enter First Number">
<input type="text" name="num2" placeholder="Enter Second Number">
<input type="submit" value="Submit">
</form>

</body>
</html>


<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
int num1 = Integer.parseInt(request.getParameter("num1"));
int num2 = Integer.parseInt(request.getParameter("num2"));

int sum = num1 + num2;

%>

<h2>The sum of the two numbers is <%= sum %></h2>