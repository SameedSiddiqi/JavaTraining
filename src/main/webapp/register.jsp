<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  %>
    
<html>
<head>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js" type="text/javascript">
  </script>
  
  <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/register.css">  
  
</head>
<body>
<div class="login-page" >
  <div class="form">
  <% String s=(String)request.getAttribute("data"); %>
     <% if (s==null) { %>
      <h2 style="text-align:right">Please Register Yourself</h2>
      <% } else { %>
         <font color="red" style="text-align:right" >Error: <%=s %></font><br>
      <% } %>
  
    <form class="register-form" action="register" method="post" id="registration_form">
    
      <input id="create-username" type="text" placeholder="username" name="username" required/>
      <span class="error_form" id="fname_error_message"></span>
      
      <input id="create-email" type="text" placeholder="email address" name="email" required/>
      <span class="error_form" id="email_error_message"></span>
      
      <input id="create-password" type="password" placeholder="password" name="password" required/>
      <span class="error_form" id="password_error_message"></span>
      
      <input type="password" id="form_retype_password"  placeholder="Retype password" required>
	  <span class="error_form" id="retype_password_error_message"></span>
      
      <input id="address" type="text" placeholder="address" name="address" />
      <input type="tel" id="phone" name="phone" placeholder="1234-12345-12" pattern="[0-9]{4}-[0-9]{5}-[0-9]{2}"><br>
      
      <input type="submit" value="Submit" id="create-button"  />  
      
      
    
      
      
       <!-- <button type="button" id="create-button">Submit Form</button>-->
      <p class="message">Already registered? <a href="login.jsp">Sign In</a></p>
    </form>
  </div>
</div>
</body>
<script src="my.js">

 	</script>

</html>