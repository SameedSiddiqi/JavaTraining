package main.java.com.contoursoftware.obs.ui.admin.controller;

import java.util.List;

import main.java.com.contoursoftware.obs.commons.ui.controller.GenericController;
import main.java.com.contoursoftware.obs.commons.ui.controller.GenericController1;
import main.java.com.contoursoftware.obs.db.book.dto.BookDto;
import main.java.com.contoursoftware.obs.service.impl.BookService;

public class AdminGetCategory implements GenericController1<BookDto> {

	BookService bookservice=new BookService();
	@Override
	public List<BookDto> performAction() {
		// TODO Auto-generated method stub
		return bookservice.getAllCategory();
	}

	

}
