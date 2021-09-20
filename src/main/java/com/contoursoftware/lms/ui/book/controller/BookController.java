package main.java.com.contoursoftware.lms.ui.book.controller;


import main.java.com.contoursoftware.lms.db.book.dao.BookDAO;
import main.java.com.contoursoftware.lms.db.book.dto.BookDto;


public class BookController{
	
	BookDAO Dao = new BookDAO();
	
	
    public void getAll() {
    	for (BookDto book : Dao.getAll()) {
			System.out.println("Book: [ID : " + book.getId() + ", Name : " + book.getName() +", Author : " + book.getAuthor() + " : Category: " + book.getCategory() + " ]");
		}
	}
    
    public void Update(int id,String str){
    	
    	BookDto book =Dao.getAll().get(id);
		Dao.update(book,str);
		
    }
    
    public void delete(int id)
    {
    	BookDto book=Dao.getAll().get(id);
		Dao.delete(book);
    }
    
    public void getOne(int obj)
    {
    	System.out.println("Book: [ID : " +Dao.getOne(obj).getId() + ", Name : " +Dao.getOne(obj).getName() +", Author : " + Dao.getOne(obj).getAuthor() + " : Category: " + Dao.getOne(obj).getCategory() + " ]");
    }
    
    public void sort() {
    	Dao.sort();
	}

}
