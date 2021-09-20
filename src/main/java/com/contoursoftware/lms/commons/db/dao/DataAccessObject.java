package main.java.com.contoursoftware.lms.commons.db.dao;

import java.util.List;

public interface DataAccessObject<T> {


	void login(T obj);

	void signUp();

	void add(T obj);

    void assign();
    
    void getAssign();

	void update_Inventory();

	List<T> getAll();

	void update();

	void delete(String name);
    
	void request();
	
	void return_obj();
	
	T getOne(String name);


}
