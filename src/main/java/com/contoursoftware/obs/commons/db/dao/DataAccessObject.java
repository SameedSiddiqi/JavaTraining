package com.contoursoftware.obs.commons.db.dao;

import java.util.List;

import com.contoursoftware.obs.commons.utils.DbException;
import com.contoursoftware.obs.commons.utils.MultipleCredential;

public interface DataAccessObject<T> {


	void add(T obj) throws DbException;

	List<T> getAll();

	void update(T obj);

	void delete(T obj);
    
	
	//T get(T obj);


}
