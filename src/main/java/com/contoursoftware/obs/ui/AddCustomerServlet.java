package com.contoursoftware.obs.ui;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.contoursoftware.obs.commons.utils.DbException;
import com.contoursoftware.obs.commons.utils.AlreadyExistException;
import com.contoursoftware.obs.db.customer.dto.CustomerDto;
import com.contoursoftware.obs.service.impl.CustomerService;

/**
 * Servlet implementation class AddCustomerServlet
 */
@WebServlet(urlPatterns={"/register"})
public class AddCustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddCustomerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String address = request.getParameter("address");
		String email = request.getParameter("email");
		String contact = request.getParameter("phone");
		
		CustomerDto customer =new CustomerDto();
		customer.setName(username);
		customer.setEmail(email);
		customer.setContact_no(contact);
		customer.setPassword(password);
		customer.setAddress(address);
		System.out.println(customer);
		
		try {
			CustomerService customerService=new CustomerService();
			customerService.add(customer);
			HttpSession session=request.getSession();  
	        session.setAttribute("success","1"); 
	        response.sendRedirect("login.jsp");
		} 
		catch (AlreadyExistException e) {
			request.setAttribute("data", e.getMessage());
			RequestDispatcher rd= request.getRequestDispatcher("register.jsp");
			rd.forward(request, response);
		} catch (DbException e) {
			throw new ServletException(e);
		}
		
		//response.sendRedirect("login.jsp");
		//RequestDispatcher rd= request.getRequestDispatcher("register.jsp");
		//rd.forward(request, response);
	}
	

}
