package com.contoursoftware.obs.commons.ui.controller;

public interface GenericController<T> {
        
	   void performAction(T obj); //Login or Add
	   
	   //void performAction(String name); //Delete 
	   
	   //void performAction(String name,String name1); // Update 
	   
	   //List<T> performAction(); //Get All
	   
	   //T performNewAction(String name); //Get one by name  
	  
}
