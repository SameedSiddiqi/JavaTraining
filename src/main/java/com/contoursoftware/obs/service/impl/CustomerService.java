package main.java.com.contoursoftware.obs.service.impl;

import java.util.List;

import main.java.com.contoursoftware.obs.db.customer.dao.CustomerDAO;
import main.java.com.contoursoftware.obs.db.customer.dto.CustomerDto;


public class CustomerService {
 
	 CustomerDAO studentDAO=new CustomerDAO();
	 
	 public void add(CustomerDto CustomerDto)
	 {
		 studentDAO.add(CustomerDto);
	 }
	 public void delete(CustomerDto CustomerDto)
	 {
		 studentDAO.delete(CustomerDto);
	 }
	 
	 public List<CustomerDto> getStudent()
	 {
		return studentDAO.getAll();
	 }
	 
	 public void update(CustomerDto CustomerDto)
	 {
		 studentDAO.update(CustomerDto);
	 }
}