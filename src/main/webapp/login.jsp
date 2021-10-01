<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<html>
<head>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/register.css">  
</head>
<body>
 <% String n=(String)session.getAttribute("success"); %>  
<% if(n!=null) { %>
<h2 style="text-align:center">Register Successfull</h2>
 <% } else { %>
         <h2 style="text-align:right"></h2>
      <% } %>

<div class="login-page" >

  <div class="form">
    <form class="register-form" action="login" method="post">
 
      <input id="create-email" type="email" placeholder="email address" name="email" required/>
      <input id="create-password" type="password" placeholder="password" name="password" required/>
      
       <input type="submit" value="Submit" id="create-button"  />
      <p class="message">New User, SignUp First? <a href="register.jsp">Sign In</a></p>
    </form>
  </div>
</div>
</body>
</html>