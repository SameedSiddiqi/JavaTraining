package com.contoursoftware.obs.ui;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.contoursoftware.obs.commons.utils.DbException;
import com.contoursoftware.obs.db.book.dto.BookDto;
import com.contoursoftware.obs.service.impl.BookService;

/**
 * Servlet implementation class AdminGetBookServlet
 */
@WebServlet(urlPatterns={"/home"})
public class AdminGetBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminGetBookServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
      BookService bookservice= new BookService();
		
		List<BookDto> list= new ArrayList<BookDto>();
		try {
			list = bookservice.getBook();
			request.setAttribute("data", list);
			RequestDispatcher rd= request.getRequestDispatcher("home.jsp");
			rd.forward(request, response);
			
		} catch (DbException e) {
			// TODO Auto-generated catch block
			throw new ServletException(e);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
