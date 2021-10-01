<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<html>
<head>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js" type="text/javascript">
  </script>
  
  <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/register.css">  
  
</head>
<body>
<div class="login-page" >
  <div class="form">
    <form class="register-form" action="register" method="post">
      <input id="create-username" type="text" placeholder="username" name="username" required/>
      <input id="create-email" type="email" placeholder="email address" name="email" required/>
      <input id="create-password" type="password" placeholder="password" name="password" required/>
      <input id="address" type="text" placeholder="address" name="address" />
      <input type="tel" id="phone" name="phone" placeholder="1234-12345-12" pattern="[0-9]{4}-[0-9]{5}-[0-9]{2}"><br>
      
       <input type="submit" value="Submit" id="create-button"  />
      <p class="message">Already registered? <a href="login.jsp">Sign In</a></p>
    </form>
  </div>
</div>
</body>
</html>