package main;


import java.util.List;
import java.util.stream.Collectors;

import main.java.com.contoursoftware.lms.db.admin.dto.AdminDto;
import main.java.com.contoursoftware.lms.db.book.dto.BookDto;
import main.java.com.contoursoftware.lms.ui.admin.controller.AdminAddBook;
import main.java.com.contoursoftware.lms.ui.admin.controller.AdminDeleteBook;
import main.java.com.contoursoftware.lms.ui.admin.controller.AdminGetBook;
import main.java.com.contoursoftware.lms.ui.admin.controller.AdminLogin;
import main.java.com.contoursoftware.lms.ui.admin.controller.SearchBook;


public class Test2 {

	public static void main(String[] args) {
		
		AdminDto myadmin = new AdminDto(0, "Sammed Siddiqi", "sameed123@gmail.com", "sameed123");
		AdminLogin adminLogin=new AdminLogin();
		adminLogin.performAction(myadmin);
		

		
		BookDto addBook=new BookDto("Java", 0, "Lewandoski", "Programming", 1);
		BookDto addBook1=new BookDto("Python", 1, "Sane", "Human Interface", 1);
		BookDto addBook2=new BookDto("C++", 2, "Haland", "Coding", 1);
		BookDto addBook3=new BookDto("React", 3, "Mane", "FrontEnd", 1);
		AdminAddBook adminAddBook=new AdminAddBook();
		adminAddBook.performAction(addBook);
		adminAddBook.performAction(addBook1);
		adminAddBook.performAction(addBook2);
		adminAddBook.performAction(addBook3);
		
		AdminGetBook adminGetBook = new AdminGetBook();
		System.out.println("Getting All Books");
		System.out.println(adminGetBook.performAction());
		
		
		SearchBook searchBook=new SearchBook();
		BookDto b1=null;
		b1=searchBook.performNewAction("Python");
		System.out.println("Searching Book by name");
		System.out.println(b1);
		
		//List<BookDto> l2 = adminGetBook.performAction().stream().filter(p -> p.getName().equals("Python")).collect(Collectors.toList());
		//System.out.println(l2);
		
		
		AdminDeleteBook adminDeleteBook=new AdminDeleteBook();
		adminDeleteBook.performAction("Python");
		System.out.println(adminGetBook.performAction());
		
	
		
	}

}
