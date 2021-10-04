<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Db Exception</title>
</head>
<body>
 <h1 style="text-align:center">Uh oh!!!</h1>
   <img src="resources/Database.png" style="display: block;
  margin-left: auto;
  margin-right: auto;
  width: 25%;" >
<p style="text-align:center">Database is under maintainence, try again later </p>
<font color="red">Error: <%=exception.getMessage() %></font><br>
</body>
</html>