package main.java.com.contoursoftware.lms.db.book.dao;


import java.util.ArrayList;
import java.util.List;

import main.java.com.contoursoftware.lms.commons.db.dao.DataAccessObject;
import main.java.com.contoursoftware.lms.db.book.dto.Book;


 public class BookDAO implements DataAccessObject<Book> {

     
     public static ArrayList<Book> book;


	public BookDAO() {
			book = new ArrayList<Book>();
			Book b1 = new Book("Java",0,"Ronaldo","Programming");
			Book b2 = new Book("C++",1,"Messi","Coding");
			Book b3 = new Book("Python",2,"Neymar","AI");
			Book b4 = new Book("React",3,"Salah","FrontEnd");
			
			book.add(b1);
			book.add(b2);
			book.add(b3);
			book.add(b4);
		}


		@Override
		public List<Book> getAll() {
			// TODO Auto-generated method stub
			return book ;
		}


		@Override
		public void update(Book obj,String str) {
			 book.get(obj.getId()).setName(str);
		     System.out.println("Book: Id " + obj.getId() + ", updated in the database");
		}


		@Override
		public void delete(Book obj) {
			book.remove(obj.getId());
			System.out.println("Book: ID " + obj.getId() + ", deleted in the database");
		}


		@Override
		public Book getOne(int obj) {
			// TODO Auto-generated method stub
			return book.get(obj);
	
		}
	}
		