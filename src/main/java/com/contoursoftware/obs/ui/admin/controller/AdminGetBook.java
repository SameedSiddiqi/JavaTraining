package main.java.com.contoursoftware.obs.ui.admin.controller;

import java.util.List;

import main.java.com.contoursoftware.obs.commons.ui.controller.GenericController1;
import main.java.com.contoursoftware.obs.db.book.dto.BookDto;
import main.java.com.contoursoftware.obs.service.impl.BookService;

public  class AdminGetBook implements GenericController1<BookDto> {

	BookService bookService=new BookService();
	
	public List<BookDto> performAction() {
		return bookService.getBook() ;
	}


}
