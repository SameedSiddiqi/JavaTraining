package main.java.com.contoursoftware.lms.db.student.dao;

import main.java.com.contoursoftware.lms.commons.db.dao.DataAccessObject;
import main.java.com.contoursoftware.lms.db.student.dto.Student;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;


public class StudentDAO implements DataAccessObject<Student> {

	 public  ArrayList<Student> student;


		public StudentDAO() {
				student = new ArrayList<Student>();
				Student s1 = new Student("Sameed",0,"CE", null);
				Student s2 = new Student("Sheryar",1,"CS", null );
				Student s3 = new Student("Usama",2,"EE", null );
				Student s4 = new Student("Sultan",3,"ME", null);
				
				student.add(s1);
				student.add(s2);
				student.add(s3);
				student.add(s4);
			}

	@Override
	public List<Student> getAll() {
		// TODO Auto-generated method stub
		return student;
	}

	@Override
	public Student getOne(int obj) {
		// TODO Auto-generated method stub
		return student.get(obj);
	}

	@Override
	public void update(Student obj, String name) {
		student.get(obj.getRollno()).setName(name);
		 System.out.println("Student: Rollno " + obj.getRollno() + ", updated in the database");
		
	}

	@Override
	public void delete(Student obj) {
		student.remove(obj.getRollno());
		
	}
	
	
	public void assignBook(Student obj,List <Book> b)
	{
		student.get(obj.getRollno()).setMybook(b);
	}
	
}
    