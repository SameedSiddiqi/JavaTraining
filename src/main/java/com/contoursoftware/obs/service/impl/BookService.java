//package main.java.com.contoursoftware.obs.service.impl;
//
//import java.util.List;
//
//import main.java.com.contoursoftware.obs.db.book.dao.ListBookDAO;
//import main.java.com.contoursoftware.obs.db.book.dto.BookDto;
//
//public class BookService {
// 
//	 ListBookDAO listBookDAO=new ListBookDAO();
//	 
//	 public void add(BookDto bookDto)
//	 {
//		 listBookDAO.add(bookDto);
//	 }
//	 public void delete(BookDto bookDto)
//	 {
//		 listBookDAO.delete(bookDto);
//	 }
//	 
//	 public List<BookDto> getBook()
//	 {
//		return listBookDAO.getAll();
//	 }
//	 
//	 public void update(BookDto bookDto)
//	 {
//		 listBookDAO.update(bookDto);
//	 }
//}

package main.java.com.contoursoftware.obs.service.impl;

import java.util.ArrayList;
import java.util.List;

import main.java.com.contoursoftware.obs.db.book.dao.DbBookDao;
import main.java.com.contoursoftware.obs.db.book.dao.ListBookDAO;
import main.java.com.contoursoftware.obs.db.book.dto.BookDto;
import main.java.com.contoursoftware.obs.db.category.dao.DbBookCategoryDao;

public class BookService {
 
	 DbBookDao dbBookDAO=new DbBookDao();
	 DbBookCategoryDao bookCategory=new  DbBookCategoryDao();
	 
	 public void add(BookDto bookDto)
	 { 
		 List<BookDto> newlist=new ArrayList<BookDto>();
		 newlist=dbBookDAO.getAll();	 
		 if (newlist.isEmpty()) {
			 dbBookDAO.add(bookDto);
			 bookCategory.add(bookDto);
		 }
		 else {
                 BookDto b1=dbBookDAO.search(newlist,bookDto);
                 if (b1!=null) {
        			 dbBookDAO.add(bookDto);
        			 bookCategory.add(bookDto);
        			 }		     		 
                 else
                	 System.out.println("Multiple Books with same name cannot be added");         
		 }
	 }
	 public void delete(BookDto bookDto)
	 {
		 dbBookDAO.delete(bookDto);
	 }
	 
	 public List<BookDto> getBook()
	 {
		 
		
		return dbBookDAO.getAll();
	 }
	 
	 public void update(BookDto bookDto)
	 {
		 dbBookDAO.update(bookDto);
	 }
	 
	 public List<BookDto> getAllCategory()
	 {
		 
		
		return bookCategory.getAll();
	 }
}