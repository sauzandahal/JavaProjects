<%@ page import="java.sql.*" %>
<%

<!DOCTYPE html>
<html lang="en">
<head>
  
    <title>Document</title>

</head>
<body>
   <%@ page import = "java.util.*"%>
   <%= Date d = new Date () ;%>
   <%=d> 
   <%
   out.write("<P> it is good to know that you are doing well </P>")
   int a= 33;
   if(a==22)
   out.write("<p> its is not 22</p>")
else 
 out.write ("<p> a is  33</p>");
 %>

</body>
</html>