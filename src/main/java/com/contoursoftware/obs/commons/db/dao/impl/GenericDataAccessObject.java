//package main.java.com.contoursoftware.lms.commons.db.dao.impl;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import java.util.stream.Collectors;
//
//import javax.print.attribute.standard.ReferenceUriSchemesSupported;
//import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;
//
//import main.java.com.contoursoftware.lms.commons.db.dao.DataAccessObject;
//import main.java.com.contoursoftware.lms.db.book.dto.BookDto;
//
//public class GenericDataAccessObject<T> implements DataAccessObject<T> {
//
//	@Override
//	public void add(T obj) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public List<T> getAll() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public void update(T obj) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void delete(T obj) {
//		// TODO Auto-generated method stub
//		
//	}
//	
////	
////	public  ArrayList<T> arrayList = new ArrayList<T>();
////
////	@Override
////	public void login(T obj) {
////		System.out.println("Logging in as Admin");
////		System.out.println(obj);	
////	}
////
////	@Override
////	public void signUp() {
////		// TODO Auto-generated method stub
////		
////	}
////
////	@Override
////	public void add(T obj) {
////		 arrayList.add(obj);
////		 System.out.println("Book Added");
////		 
////	}
////
////	@Override
////	public void assign() {
////		// TODO Auto-generated method stub
////		
////	}
////
////	@Override
////	public void getAssign() {
////		// TODO Auto-generated method stub
////		
////	}
////
////	@Override
////	public void update_Inventory() {
////		// TODO Auto-generated method stub
////		
////	}
////
////	@Override
////	public List<T> getAll() {
////		return (List<T>) arrayList;
////		
////	}
////
////
////	@Override
////	public void update(String name, String name1) {
////	
////		for(BookDto getname:arrayList)
////		{
////			if (getname.getName()==name)
////			{
////				getname.setCategory(name1);
////				break;
////			
////			}
////		}
////		System.out.println("Book "+ name + " Cateogry Changed to " +name1+" Successfully");	
////		
////	}
////
////
////	@Override
////	public void request() {
////		// TODO Auto-generated method stub
////		
////	}
////
////	@Override
////	public void return_obj() {
////		// TODO Auto-generated method stub
////		
////	}
////
////	@Override
////	public T getOne(String name) {
////		BookDto result = null;
////		for(BookDto getname:arrayList)
////		{
////			if (getname.getName()==name)
////				result=getname;
////					
////		}
////		
////		return (T) result;
////	}
////
////	@Override
////	public void delete(String name) {
////		for(BookDto getname:arrayList)
////		{
////			if (getname.getName()==name)
////			{
////				arrayList.remove(getname);
////				break;
////			
////			}
////			System.out.println("Book "+ name + " removed Successfully");	
////		}
////		
////	}
//}
//
//
