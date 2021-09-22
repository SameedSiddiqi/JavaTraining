package main.java.com.contoursoftware.obs.service.impl;


import main.java.com.contoursoftware.obs.db.admin.dao.AdminDao;
import main.java.com.contoursoftware.obs.db.admin.dto.AdminDto;
import main.java.com.contoursoftware.obs.db.book.dto.BookDto;

public class AdminService {

	 AdminDao adminDao=new AdminDao();
	 
	public void add(AdminDto adminDto)
	 {
		 adminDao.add(adminDto);
	 }
	 public void delete(AdminDto adminDto)
	 {
		 adminDao.delete(adminDto);
	 }
       
	 
}
