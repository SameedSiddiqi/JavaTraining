package main.java.com.contoursoftware.obs.db.book.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import main.java.com.contoursoftware.obs.commons.db.dao.DataAccessObject;
import main.java.com.contoursoftware.obs.commons.utils.Searchable;
import main.java.com.contoursoftware.obs.db.book.dto.BookDto;

public class ListBookDAO implements DataAccessObject<BookDto> {
	
	public  static ArrayList<BookDto> arrayList = new ArrayList<BookDto>();
	
	@Override
	public void add(BookDto obj) {
		arrayList.add(obj);
		System.out.println("Book Added");
		
	}

	@Override
	public List<BookDto> getAll() {
		
		return arrayList;
	}

	@Override
	public void update(BookDto obj) {
		for(BookDto array:arrayList)
		{
			if (array.getId()==obj.getId()) {
				array.setCategory(obj.getCategory());
			     break;
			}
					
		}
		
	}

	@Override
	public void delete(BookDto obj) {
		BookDto result = null;
		for(BookDto array:arrayList)
		{
			if (array.getId()==obj.getId())
				result=array;
					
		}
		arrayList.remove(result);
		
	}



//
//
//	@Override
//	public void add(BookDto obj) {
//		super.add(obj);
//		
//	}
//
//	@Override
//	public void assign() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public BookDto getOne(String name) {
//		// TODO Auto-generated method stub
//		return super.getOne(name);
//	}
//
//	@Override
//	public void getAssign() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void update_Inventory() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public List<BookDto> getAll() {
//		return super.getAll();
//		// TODO Auto-generated method stub
//		
//	}
//
//
//	@Override
//	public void update(String name,String name1) {
//		
//		super.update(name,name1);
//		
//	}
//
//
//	@Override
//	public void delete(String name) {
//		// TODO Auto-generated method stub
//		super.delete(name);
//	}
//
//	@Override
//	public void request() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void return_obj() {
//		// TODO Auto-generated method stub
//		
//	}
//	 
//	 

 }
		