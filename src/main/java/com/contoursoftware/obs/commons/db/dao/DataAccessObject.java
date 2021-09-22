package main.java.com.contoursoftware.obs.commons.db.dao;

import java.util.List;

public interface DataAccessObject<T> {


	void add(T obj);

	List<T> getAll();

	void update(T obj);

	void delete(T obj);
    
	
	//T get(T obj);


}
