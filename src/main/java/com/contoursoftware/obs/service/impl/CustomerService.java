package com.contoursoftware.obs.service.impl;

import java.util.List;

import com.contoursoftware.obs.commons.utils.DbException;
import com.contoursoftware.obs.commons.utils.AlreadyExistException;
import com.contoursoftware.obs.db.customer.dao.DbCustomerDAO;
import com.contoursoftware.obs.db.customer.dto.CustomerDto;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class CustomerService {
 
	 DbCustomerDAO customerDao=new DbCustomerDAO();
	 
	 
	 public void add(CustomerDto CustomerDto) throws AlreadyExistException , DbException
	 {
		  //validate(CustomerDto);
		  if(validate(CustomerDto))
		  {
			//System.out.println(validator);
			  int b1=customerDao.countByCriteria(CustomerDto);
	          System.out.println("b1 "+b1);
	          if (b1==0) {
	        	  System.out.println(CustomerDto); 
	 			 customerDao.add(CustomerDto);
	 			 }		     		 
	          else
	          {
	        	  throw new AlreadyExistException("Multiple Customer with same name cannot be added"); 
	         	 //System.out.println("Multiple Customer with same name cannot be added");   
	          }
		  }
		  
		  else {
			  throw new AlreadyExistException("Baap se panga mat le"); 
		  }
		  
          
          
          
	 }
	 
	 
	 private boolean validate(CustomerDto customerDto) {
		String name=customerDto.getName();
		String email=customerDto.getEmail();
		String password=customerDto.getPassword();
	    
	    Pattern pattern = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
	    Matcher matcher = pattern.matcher(email);
	    
	    boolean matchFound = matcher.find();
	    
	   if(name.matches("^[a-zA-Z]*$") && matchFound && password.length()>=8)
		return true;
	   
	   else
		return false;
	}


	public void delete(CustomerDto CustomerDto) throws DbException
	 {
		 customerDao.delete(CustomerDto);
	 }
	 
	 public List<CustomerDto> getStudent() throws DbException
	 {
		return customerDao.getAll();
	 }
	 
	 public void update(CustomerDto CustomerDto) throws DbException
	 {
		 customerDao.update(CustomerDto);
	 }
	 
	 public void order(CustomerDto CustomerDto) throws DbException
	 {
		 customerDao.order(CustomerDto);
	 }
	 
	 public CustomerDto loginCustomer(CustomerDto CustomerDto) throws DbException
	 {
		return customerDao.getCustomer(CustomerDto);
	 }
	 
	 
}