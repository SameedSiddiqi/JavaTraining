package com.contoursoftware.obs.ui;

import java.util.List;

import com.contoursoftware.obs.commons.ui.controller.GenericController;
import com.contoursoftware.obs.commons.ui.controller.GenericController1;
import com.contoursoftware.obs.db.admin.dto.AdminDto;
import com.contoursoftware.obs.db.book.dao.ListBookDAO;
import com.contoursoftware.obs.db.book.dto.BookDto;
import com.contoursoftware.obs.service.impl.BookService;

public class AdminGetCategory implements GenericController1<BookDto> {

	BookService bookservice=new BookService();
	@Override
	public List<BookDto> performAction() {
		// TODO Auto-generated method stub
		return bookservice.getAllCategory();
	}

	

}
