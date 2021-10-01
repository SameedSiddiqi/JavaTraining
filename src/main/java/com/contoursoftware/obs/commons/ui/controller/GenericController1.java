package com.contoursoftware.obs.commons.ui.controller;

import java.util.List;

public interface GenericController1<T> {
          
	   //void performAction(String name); //Delete 
	   
	   //void performAction(String name,String name1); // Update 
	   
	   List<T> performAction(); //Get All
	   
	   //T performNewAction(String name); //Get one by name  
	  
}
