package main.java.com.contoursoftware.obs.ui.student.controller;

import java.util.List;

import main.java.com.contoursoftware.obs.commons.ui.controller.GenericController1;
import main.java.com.contoursoftware.obs.db.customer.dto.CustomerDto;
import main.java.com.contoursoftware.obs.service.impl.CustomerService;

public class GetAllCustomer implements GenericController1<CustomerDto>{

	CustomerService customerService= new CustomerService();
	@Override
	public List<CustomerDto> performAction() {
		// TODO Auto-generated method stub
		return customerService.getStudent();
	}

}
