package main.java.com.contoursoftware.lms.db.book.dao;

import java.util.List;

import main.java.com.contoursoftware.lms.commons.db.dao.impl.GenericDataAccessObject;
import main.java.com.contoursoftware.lms.db.book.dto.BookDto;

public class BookDAO extends GenericDataAccessObject<BookDto> {



	@Override
	public void add(BookDto obj) {
		super.add(obj);
		
	}

	@Override
	public void assign() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public BookDto getOne(String name) {
		// TODO Auto-generated method stub
		return super.getOne(name);
	}

	@Override
	public void getAssign() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update_Inventory() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<BookDto> getAll() {
		return super.getAll();
		// TODO Auto-generated method stub
		
	}


	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void delete(String name) {
		// TODO Auto-generated method stub
		super.delete(name);
	}

	@Override
	public void request() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void return_obj() {
		// TODO Auto-generated method stub
		
	}
	 
	 

 }
		