package main.java.com.contoursoftware.lms.commons.ui.controller;

import java.util.List;

public interface GenericController<T> {
        
	   void performAction(T obj);
	   
	   void performAction(String name);
	   
	   List<T> performAction();
	   
	   T performNewAction(String name);  
	  
}
