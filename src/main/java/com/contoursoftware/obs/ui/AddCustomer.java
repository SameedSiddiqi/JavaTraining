package com.contoursoftware.obs.ui;

import com.contoursoftware.obs.commons.ui.controller.GenericController;
import com.contoursoftware.obs.db.customer.dto.CustomerDto;
import com.contoursoftware.obs.service.impl.CustomerService;

public class AddCustomer implements GenericController<CustomerDto> {

	CustomerService customerService=new CustomerService();
	
	@Override
	public void performAction(CustomerDto obj) {
		customerService.add(obj);
		
	}

}
