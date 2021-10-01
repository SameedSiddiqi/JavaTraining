package com.contoursoftware.obs.service.impl;

import java.util.List;

import com.contoursoftware.obs.commons.utils.DbException;
import com.contoursoftware.obs.commons.utils.MultipleCredential;
import com.contoursoftware.obs.db.customer.dao.DbCustomerDAO;
import com.contoursoftware.obs.db.customer.dto.CustomerDto;


public class CustomerService {
 
	 DbCustomerDAO customerDao=new DbCustomerDAO();
	 
	 
	 public void add(CustomerDto CustomerDto) throws MultipleCredential, DbException
	 {
		  int b1=customerDao.countByCriteria(CustomerDto);
          System.out.println("b1 "+b1);
          if (b1==0) {
        	  System.out.println(CustomerDto); 
 			 customerDao.add(CustomerDto);
 			 }		     		 
          else
          {
        	  throw new MultipleCredential(); 
         	 //System.out.println("Multiple Customer with same name cannot be added");   
          }
	 }
	 
	 
	 public void delete(CustomerDto CustomerDto)
	 {
		 customerDao.delete(CustomerDto);
	 }
	 
	 public List<CustomerDto> getStudent()
	 {
		return customerDao.getAll();
	 }
	 
	 public void update(CustomerDto CustomerDto)
	 {
		 customerDao.update(CustomerDto);
	 }
	 
	 public void order(CustomerDto CustomerDto)
	 {
		 customerDao.order(CustomerDto);
	 }
	 
	 public CustomerDto loginCustomer(CustomerDto CustomerDto)
	 {
		return customerDao.getCustomer(CustomerDto);
	 }
	 
	 
}