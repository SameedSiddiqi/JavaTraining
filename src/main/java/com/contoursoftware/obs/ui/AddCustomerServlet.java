package com.contoursoftware.obs.ui;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



import com.contoursoftware.obs.commons.utils.DbException;
import com.contoursoftware.obs.commons.utils.MyFilter;
import com.contoursoftware.obs.commons.utils.MyFormatter;
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
		 Logger logger = Logger.getLogger(AddCustomerServlet.class.getName());
		 
		 try {
			//FileHandler file name with max size and number of log files limit
			Handler fileHandler = new FileHandler("/Users/logger.log", 2000, 5);
			fileHandler.setFormatter(new MyFormatter());
			//setting custom filter for FileHandler
			fileHandler.setFilter(new MyFilter());
			logger.addHandler(fileHandler); //create a separate class that will return filehandler,
			}
			catch(SecurityException | IOException e) {

			}



		
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
			logger.log(Level.WARNING, e.getMessage());
			logger.log(Level.WARNING,"HELP");
			System.out.println(e.getClass().getCanonicalName());
			throw new ServletException(e);
		}
		
		//response.sendRedirect("login.jsp");
		//RequestDispatcher rd= request.getRequestDispatcher("register.jsp");
		//rd.forward(request, response);
	
	
	}
}




















