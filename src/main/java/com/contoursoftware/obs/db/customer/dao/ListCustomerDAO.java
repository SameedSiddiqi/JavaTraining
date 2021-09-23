package main.java.com.contoursoftware.obs.db.customer.dao;

import java.util.ArrayList;
import java.util.List;

import main.java.com.contoursoftware.obs.commons.db.dao.DataAccessObject;
import main.java.com.contoursoftware.obs.db.customer.dto.CustomerDto;

public class ListCustomerDAO implements DataAccessObject<CustomerDto> {
	
	public  static ArrayList<CustomerDto> arrayList = new ArrayList<CustomerDto>();
	
	@Override
	public void add(CustomerDto obj) {
		arrayList.add(obj);
		System.out.println("Customer Added");
		
	}

	@Override
	public List<CustomerDto> getAll() {
		
		return arrayList;
	}

	@Override
	public void update(CustomerDto obj) {
//		for(CustomerDto array:arrayList)
//		{
//			if (array.getId()==obj.getId()) {
//				array.setDepartment(obj.getDepartment());
//			     break;
//			}
//					
//		}
		
	}

	@Override
	public void delete(CustomerDto obj) {
		CustomerDto result = null;
		for(CustomerDto array:arrayList)
		{
			if (array.getId()==obj.getId())
				result=array;
					
		}
		arrayList.remove(result);
		
	}

//
//
//	@Override
//	public void add(StudentDto obj) {
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
//	public StudentDto getOne(String name) {
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
//	public List<StudentDto> getAll() {
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
		