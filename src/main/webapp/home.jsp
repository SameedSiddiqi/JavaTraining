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
  </head>
  <body>
  <li><a href="index.jsp">Back</a></li>
      <h1>Displaying Book List</h1>
      <div >
       <% String n=(String)session.getAttribute("name"); %>  
        <% if (n!=null) { %>
         <h2 style="text-align:right">Welcome  <%=n %></h2>
      <% } else { %>
         <h2 style="text-align:right"> Log in First</h2>
      <% } %>
      </div>
      <table border ="1" width="500" align="center">
         <tr bgcolor="00FF7F">
          <th><b>Book Title</b></th>
          <th><b>Book Author</b></th>
         </tr>
   
        <% List<BookDto> std = (ArrayList<BookDto>)request.getAttribute("data");
        for(BookDto s : std){
        %>
        <%-- Arranging data in tabular form
        --%>
            <tr>
                <td><%=s.getTitle()%></td>
                <td><%=s.getAuthor()%></td>
            </tr>
            <%}%>
        </table> 
        <hr/>
    </body>
</html>