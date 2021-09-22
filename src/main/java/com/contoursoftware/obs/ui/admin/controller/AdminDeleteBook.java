package main.java.com.contoursoftware.obs.ui.admin.controller;


import main.java.com.contoursoftware.obs.commons.ui.controller.GenericController;
import main.java.com.contoursoftware.obs.db.book.dto.BookDto;
import main.java.com.contoursoftware.obs.service.impl.BookService;

public class AdminDeleteBook implements GenericController<BookDto> {

	BookService bookService=new BookService();
	
	@Override
	public void performAction(BookDto obj) {
		 
		bookService.delete(obj);
	}


}