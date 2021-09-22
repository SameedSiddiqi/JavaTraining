package main.java.com.contoursoftware.obs.service.impl;

import java.util.List;

import main.java.com.contoursoftware.obs.db.book.dao.BookDAO;
import main.java.com.contoursoftware.obs.db.book.dto.BookDto;

public class BookService {
 
	 BookDAO bookDAO=new BookDAO();
	 
	 public void add(BookDto bookDto)
	 {
		 bookDAO.add(bookDto);
	 }
	 public void delete(BookDto bookDto)
	 {
		 bookDAO.delete(bookDto);
	 }
	 
	 public List<BookDto> getBook()
	 {
		return bookDAO.getAll();
	 }
	 
	 public void update(BookDto bookDto)
	 {
		 bookDAO.update(bookDto);
	 }
}