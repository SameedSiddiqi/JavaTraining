//package main.java.com.contoursoftware.lms.ui.book.controller;
//import java.util.ArrayList;
//import java.util.List; 
//import main.java.com.contoursoftware.lms.db.book.dao.BookDAO;
//import main.java.com.contoursoftware.lms.db.book.dto.Book;
//
//public class BookConcrete extends BookDAO {
//
//
//	public static ArrayList<Book> book;
//
//
//	public BookConcrete() {
//		book = new ArrayList<Book>();
//		Book b1 = new Book("Java",0,"Ronaldo","Programming");
//		Book b2 = new Book("C++",1,"Messi","Coding");
//		Book b3 = new Book("Python",2,"Neymar","AI");
//		Book b4 = new Book("React",3,"Salah","FrontEnd");
//		
//		book.add(b1);
//		book.add(b2);
//		book.add(b3);
//		book.add(b4);
//
//	}
//
//
//	@Override
//	public List<Book> getAll() {
//		// TODO Auto-generated method stub
//		return book ;
//	}
//
//
//	@Override
//	public void update(Book obj) {
//		 book.get(obj.getId()).setName(obj.getName());
//	     System.out.println("Student: Roll No " + obj.getId() + ", updated in the database");
//	}
//
//
//	@Override
//	public void delete(Book obj) {
//		book.remove(obj.getId());
//		System.out.println("Student: Roll No " + obj.getId() + ", deleted in the database");
//	}
//
//
//	@Override
//	public Book getOne(int obj) {
//		// TODO Auto-generated method stub
//		return book.get(obj);
//	}
//	
//}
