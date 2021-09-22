package main.java.com.contoursoftware.obs.ui.admin.controller;
import java.util.List;
import java.util.stream.Collectors;

import main.java.com.contoursoftware.obs.db.book.dao.BookDAO;
import main.java.com.contoursoftware.obs.db.book.dto.BookDto;

public class SearchBook  {

	public List<BookDto> performNewAction(String name) {
		AdminGetBook adminGetBook = new AdminGetBook();
		List<BookDto> l2 = adminGetBook.performAction().stream().filter(p -> p.getTitle().equals(name)).collect(Collectors.toList());
		return l2;
		
		// TODO Auto-generated method stub
	}
   
}
