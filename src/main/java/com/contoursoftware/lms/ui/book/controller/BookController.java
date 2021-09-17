package main.java.com.contoursoftware.lms.ui.book.controller;

import java.util.ArrayList;
import java.util.List;

import main.java.com.contoursoftware.lms.db.book.dao.BookDAO;
import main.java.com.contoursoftware.lms.db.book.dto.Book;


public class BookController{
	
	
	
	
	BookDAO Dao = new BookDAO();
	
	
    public void getAll() {
    	for (Book book : Dao.getAll()) {
			System.out.println("Book: [ID : " + book.getId() + ", Name : " + book.getName() +", Author : " + book.getAuthor() + " : Category: " + book.getCategory() + " ]");
		}
	}
    
    public void Update(int id,String str){
    	
    	Book book =Dao.getAll().get(id);
		Dao.update(book,str);
		
    }
    
    public void delete(int id)
    {
    	Book book=Dao.getAll().get(id);
		Dao.delete(book);
    }
    
    public void getOne(int obj)
    {
    	System.out.println("Book: [ID : " +Dao.getOne(obj).getId() + ", Name : " +Dao.getOne(obj).getName() +", Author : " + Dao.getOne(obj).getAuthor() + " : Category: " + Dao.getOne(obj).getCategory() + " ]");
    }

}
