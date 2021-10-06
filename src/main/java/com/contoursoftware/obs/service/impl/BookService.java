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

package com.contoursoftware.obs.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.contoursoftware.obs.commons.utils.DbException;
import com.contoursoftware.obs.db.book.dao.DbBookDao;

import com.contoursoftware.obs.db.book.dto.BookDto;
import com.contoursoftware.obs.db.category.dao.DbBookCategoryDao;

public class BookService {
 
	 DbBookDao dbBookDAO=new DbBookDao();
	 DbBookCategoryDao bookCategory=new  DbBookCategoryDao();
	 
	 public void add(BookDto bookDto) throws DbException
	 { 
                
                 int b1=dbBookDAO.countByCriteria(bookDto);
                 System.out.println("b1 "+b1);
                 if (b1==0) {
        			 dbBookDAO.add(bookDto);
        			 bookCategory.add(bookDto);
        			 }		     		 
                 else
                	 System.out.println("Multiple Books with same name cannot be added");         
		}

	 public void delete(BookDto bookDto) throws DbException
	 {
		 dbBookDAO.delete(bookDto);
	 }
	 
	 public List<BookDto> getBook() throws DbException
	 {
		 
		
		return dbBookDAO.getAll();
	 }
	 
	 public void update(BookDto bookDto) throws DbException
	 {
		 dbBookDAO.update(bookDto);
	 }
	 
	 public List<BookDto> getAllCategory() throws DbException
	 {
		 
		
		return bookCategory.getAll();
	 }
}