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
<script src="jQuery.js">

// $(document).ready(function() {
// 	var loginUsername;
// 	var loginPassword;
// 	var account = [loginUsername, loginPassword];
 
//  	$('#create-button').click(function(){  
// 		var createUsernameEntry = $("#create-username").val();
// 		var createPasswordEntry = $("#create-password").val();
// 		var createEmailEntry = $("#create-email").val();
//     var createUsernameValid = false;
//     var createPasswordValid = false;
//     var createEmailValid = false;
//     var createUsernameObject = $("#create-username");
//     var createPasswordObject = $("#create-password");
//     var createEmailObject = $("#create-email");
//     var validate = /^\s*[a-zA-Z0-9,\s]+\s*$/;
//     var validateEmail = /^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
   
//     if(!validate.test(createUsernameEntry) || (createUsernameEntry).length == 0) {
//       $(createUsernameObject).addClass("error")
//       $(createUsernameObject).val("No special characters or spaces.")
//     } else {
//       createUsernameValid = true;
//       var createUsername = $(createUsernameObject).val();
//     }
    
//     if(!validate.test(createPasswordEntry) || (createPasswordEntry).length == 0) {
//       $(createPasswordObject).addClass("error");
//       $(createPasswordObject).val("No special characters or spaces.");
//     } else {
//       createPasswordValid = true;
//       var createPassword = $(createPasswordObject).val();
//     }
    
//     if(!validateEmail.test(createEmailEntry)) {
//       $(createEmailObject).addClass("error");
//       $(createEmailObject).val("Enter a valid email");
//     } else {
//       createEmailValid = true;
//       console.log("Account Email " + createEmailObject.val())
//     }
      
//     $(createUsernameObject).on('click', function () {
//       $(this).val("");  
//       $(this).removeClass("error");
//     });
    
//     $(createPasswordObject).on('click', function () {
//       $(this).val("");  
//       $(this).removeClass("error");
//     });
    
//     $(createEmailObject).on('click', function () {
//       $(this).val("");
//       $(this).removeClass("error");
//     });
    
// 		account = [createUsername, createPassword];
// 		console.log("Account Username " + account[0]);
// 		console.log("Account Password " + account[1]);
		
// 		if(createUsernameValid == true && createPasswordValid == true && createEmailValid == true) {
		   
// 			submitHandler: function(form) {
// 			      form.submit();
// 			    }
// 		}
			
// 			});
// });	  
		
 	</script>

</html>