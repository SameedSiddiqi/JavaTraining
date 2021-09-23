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

public class BookService {
 
	 DbBookDao dbBookDAO=new DbBookDao();
	 
	 public void add(BookDto bookDto)
	 {
//		 List<BookDto> newlist=new ArrayList<BookDto>();
//		 newlist=dbBookDAO.getAll();
//		 if (newlist.isEmpty())
//		 {
//			 dbBookDAO.add(bookDto);
//		 }
//		 else {
//		 for (BookDto item : newlist)
//		 {
//			 System.out.println(item.getTitle());
//			 if(item.getTitle()==bookDto.getTitle())
//			 {
//				 System.out.println("Multiple Books with same name cannot be added");
//				 
//			 }
//			 else
//			 {
//				 dbBookDAO.add(bookDto);
//			 }
//		 }
//		 }
		 dbBookDAO.add(bookDto);
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
}