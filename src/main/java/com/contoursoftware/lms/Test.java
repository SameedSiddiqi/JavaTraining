package main.java.com.contoursoftware.lms;


import java.util.ArrayList;

import main.java.com.contoursoftware.lms.db.book.dto.Book;

//import java.util.ArrayList;

import main.java.com.contoursoftware.lms.ui.book.controller.BookController;
import main.java.com.contoursoftware.lms.ui.student.controller.StudentController;
//import main.java.com.contoursoftware.lms.ui.book.controller.BookConcrete;

public class Test {

	public static void main(String[] args) {
		

		BookController bookController=new BookController();
		StudentController studentController=new StudentController();
		
		System.out.println("Book Details\n");
		bookController.getAll();
		bookController.Update(0,"ABHIJEET");
		bookController.delete(3);
		bookController.getAll();
		bookController.getOne(2);
		
		System.out.println("\nStudent Details\n");
	    studentController.getAll();
	    studentController.Update(0,"ABHIJEET");
	    studentController.delete(3);
		studentController.getAll();
		
		
	}
}
