//package main.java.com.contoursoftware.lms.commons.ui.controller.impl;
//
//import java.util.List;
//
//import main.java.com.contoursoftware.lms.commons.ui.controller.GenericController;
//import main.java.com.contoursoftware.lms.db.admin.dao.AdminDao;
//import main.java.com.contoursoftware.lms.db.admin.dto.AdminDto;
//import main.java.com.contoursoftware.lms.db.book.dao.BookDAO;
//import main.java.com.contoursoftware.lms.db.book.dto.BookDto;
//
//public class GenericControllerImpl<T> implements GenericController<T> {
//
//	
//	AdminDao adminDao= new AdminDao();
//	BookDAO bookDAO=new BookDAO();
//	@Override
//	public void performAction(T obj) {
//		if(obj instanceof AdminDto)
//		adminDao.login((AdminDto) obj);
//		else 
//		bookDAO.add((BookDto) obj);
//		
//	}
//
//	@Override
//	public List<T> performAction() {
//		return (List<T>) bookDAO.getAll();
//		
//	}
//
//	@Override
//	public T performNewAction(String name) {
//		// TODO Auto-generated method stub
//		return (T) bookDAO.getOne(name);
//	}
//
//	@Override
//	public void performAction(String name) {
//		bookDAO.delete(name);
//		
//	}
//
//	@Override
//	public void performAction(String name, String name1) {
//		
//		bookDAO.update(name,name1);
//		
//	}
//
//}
