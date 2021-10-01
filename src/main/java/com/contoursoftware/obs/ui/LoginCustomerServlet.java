package com.contoursoftware.obs.ui;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.contoursoftware.obs.db.customer.dto.CustomerDto;
import com.contoursoftware.obs.service.impl.CustomerService;

/**
 * Servlet implementation class LoginCustomerServlet
 */
@WebServlet(urlPatterns={"/login"})
public class LoginCustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginCustomerServlet() {
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
		// TODO Auto-generated method stub
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		
		CustomerDto customer =new CustomerDto();
		customer.setEmail(email);
		customer.setPassword(password);
		
		CustomerService customerService=new CustomerService();
		CustomerDto customer1 =new CustomerDto();
		customer1 = customerService.loginCustomer(customer);
		System.out.println(customer1);
		
		if(customer1!=null)
		{
			HttpSession session=request.getSession();  
	        session.setAttribute("name",customer1.getName()); 
	        response.sendRedirect("/OBS/home");
		}
		else
			 response.sendRedirect("login.jsp");
			
		
	}

}
