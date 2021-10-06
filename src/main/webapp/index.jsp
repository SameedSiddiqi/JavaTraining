<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="error.jsp" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" name="viewport" content="width=device-width, initial-scale=1.0">
    <title>OBS</title>
    <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@400;600;700;900&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/style.css">   
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous"> 
    <script
  src="https://code.jquery.com/jquery-3.6.0.js"
  integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk="
  crossorigin="anonymous">
    </script>

</head>
<body>
    <header>
    <div class="wrapper  ">
       

        
<ul class="nav-area ">
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
  
      <input type="button" value="submit" id="submit"> 
      <div id="data"></div>
</body>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>

<script src="ajax.js">

</script>
</html>
