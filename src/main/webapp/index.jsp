<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="error.jsp" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>OBS</title>
    <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@400;600;700;900&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/style.css">    
</head>
<body>
    <header>
    <div class="wrapper">
        <div class="logo">
            <img src="resources/book.jpg" align="left">
        </div>
<ul class="nav-area">
<li><a href="${pageContext.request.contextPath}/home">Home</a></li>
<li><a href="about.html">About</a></li>
 <% String n=(String)session.getAttribute("name"); %>  
        <% if (n!=null) { %>
         <li><a href="${pageContext.request.contextPath}/logout">Logout</a></li>
      <% } else { %>
       <li><a href="login.jsp">Login</a></li>
      <% } %>

<li><a href="register.jsp">SignUp</a></li>
<li><a href="#">Contact</a></li>
<li><a href="#">Admin Login</a></li>


</ul>
</div>
<div class="welcome-text">
        <h1>
Online <span>Book</span> Store </h1>
<a href="#">Login</a>
<a href="register.jsp">Sign Up</a>
<a href="${pageContext.request.contextPath}/home">Visit Website</a>
    </div>
</header>

</body>
</html>
