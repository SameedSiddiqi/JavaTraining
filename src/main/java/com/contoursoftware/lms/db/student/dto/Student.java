package main.java.com.contoursoftware.lms.db.student.dto;

import java.awt.print.Book;
import java.util.List;

public class Student {
	 private String name;
     private int rollno;
     private String department;
    
	private List<Book> mybook;
     
	public Student(String name, int rollno, String department,List<Book> mybook) {

		this.name = name;
		this.rollno = rollno;
		this.department = department;
		this.mybook=mybook;
	}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getRollno() {
			return rollno;
		}
		public void setRollno(int rollno) {
			this.rollno = rollno;
		}
		public String getDepartment() {
			return department;
		}
		public void setDepartment(String department) {
			this.department = department;
		}
		
	     public List<Book> getMybook() {
				return mybook;
			}
		 public void setMybook(List<Book> mybook) {
				this.mybook = mybook;
			}
     
}
