<%@page import="java.util.ArrayList"%>
<%@page import="com.contoursoftware.obs.db.book.dto.BookDto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="error.jsp" %>
<!DOCTYPE html>
<html>
  <head>
   <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
   <title>Book List</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
  </head>
  <body>
  
  <nav class="navbar navbar-expand-lg navbar-light bg-info bg-gradient">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">OBS</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
      <li class="nav-item">
          <a class="nav-link " aria-current="page" href="index.jsp">Main Page</a>
        </li>
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="#">Home</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="about.html">About</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="about.html">Contact Us</a>
        </li>
         <% String n=(String)session.getAttribute("name"); %>  
         <% if (n!=null) { %>
          <li class="nav-item">
          <a class="nav-link" href="${pageContext.request.contextPath}/logout">Logout</a>
        </li>
      <% } else { %>
         
      <% } %>   
       
        
      </ul>
      <form class="d-flex">
     
      
        <% if (n!=null) { %>
         <h2 style="text-align:right">Welcome  <%=n %></h2>
      <% } else { %>
         <a class="nav-link" href="login.jsp">Login</a>
          <a class="nav-link" href="register.jsp">SignUp</a>
      <% } %>       
      </form>
    </div>
  </div>
</nav>
 
 <div class="container-fluid  mt-3 ">
  <div id="carouselExampleControls" class="carousel slide" data-bs-ride="carousel">
  <div class="carousel-inner">
    <div class="carousel-item active ">
      <img src="resources/book1.jpg "  width="2000"  height="600"  alt="...">
    </div>
    <div class="carousel-item ">
      <img src="resources/book2.jpg"  width="2000" height="600" alt="...">
    </div>
    <div class="carousel-item  ">
      <img src="resources/book3.jpg"  width="2000" height="600" alt="...">
    </div>
  </div>
  <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleControls" data-bs-slide="prev">
    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
    <span class="visually-hidden">Previous</span>
  </button>
  <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleControls" data-bs-slide="next">
    <span class="carousel-control-next-icon" aria-hidden="true"></span>
    <span class="visually-hidden">Next</span>
  </button>
</div>
</div>

<div class="container mt-5">
     <h1 style="text-align:center">Displaying Book List</h1>                                                                                     
  <div class="table-responsive table-bordered ">          
  <table class="table">
    
      <tr class="table-info">
          <th><b>Book Title</b></th>
          <th><b>Book Author</b></th>
           <th><b>Book Copies</b></th>
      </tr>
 
    <tbody>
      <% List<BookDto> std = (ArrayList<BookDto>)request.getAttribute("data");
        for(BookDto s : std){
        %>
        <%-- Arranging data in tabular form
        --%>
            <tr class="bg-warning">
                <td><%=s.getTitle()%></td>
                <td><%=s.getAuthor()%></td>
                <td><%=s.getCopies()%></td>
            </tr>
            <%}%>
            </tbody>
        </table> 
    
  </div>
</div>
  
      
        
   
        
    </body>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-/bQdsTh/da6pkI1MST/rWKFNjaCP5gBSY4sEBT38Q/9RBh9AH40zEOg7Hlq2THRZ" crossorigin="anonymous"></script>
</html>



