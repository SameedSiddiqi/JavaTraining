package main.java.com.contoursoftware.lms.ui.student.controller;

import main.java.com.contoursoftware.lms.db.student.dao.StudentDAO;
import main.java.com.contoursoftware.lms.db.student.dto.Student;

public class StudentController {
	
StudentDAO Dao = new StudentDAO();
	
	
    public void getAll(){
    	for (Student student : Dao.getAll()) {
			System.out.println("Student: [ID : " + student.getRollno() + ", Name : " + student.getName() +", Author : " + student.getDepartment() + " : Books: Null "+ " ]");
		}
	}
    
    public void Update(int id,String str){
    	
    	Student student =Dao.getAll().get(id);
		Dao.update(student,str);
		
    }
    
    public void delete(int id)
    {
    	Student student=Dao.getAll().get(id);
		Dao.delete(student);
    }
    
}