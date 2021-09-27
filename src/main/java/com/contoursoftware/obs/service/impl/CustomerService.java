package main.java.com.contoursoftware.obs.service.impl;

import java.util.List;

import main.java.com.contoursoftware.obs.db.customer.dao.DbCustomerDAO;
import main.java.com.contoursoftware.obs.db.customer.dto.CustomerDto;


public class CustomerService {
 
	 DbCustomerDAO customerDao=new DbCustomerDAO();
	 
	 
	 public void add(CustomerDto CustomerDto)
	 {
		  int b1=customerDao.countByCriteria(CustomerDto);
          System.out.println("b1 "+b1);
          if (b1==0) {
 			 customerDao.add(CustomerDto);
 			 }		     		 
          else
         	 System.out.println("Multiple Books with same name cannot be added");         
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
	 
}