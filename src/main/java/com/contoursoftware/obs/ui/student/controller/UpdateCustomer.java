package main.java.com.contoursoftware.obs.ui.student.controller;

import main.java.com.contoursoftware.obs.commons.ui.controller.GenericController;
import main.java.com.contoursoftware.obs.db.customer.dto.CustomerDto;
import main.java.com.contoursoftware.obs.service.impl.CustomerService;

public class UpdateCustomer implements GenericController<CustomerDto>{

	CustomerService customerService=new CustomerService();

	@Override
	public void performAction(CustomerDto obj) {
		customerService.update(obj);

	}

}
