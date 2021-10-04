package com.contoursoftware.obs.commons.db.dao;

import java.util.List;

import com.contoursoftware.obs.commons.utils.DbException;
import com.contoursoftware.obs.commons.utils.AlreadyExistException;

public interface DataAccessObject<T> {


	void add(T obj) throws DbException;

	List<T> getAll() throws DbException;

	void update(T obj) throws DbException;

	void delete(T obj) throws DbException;
    
	
	//T get(T obj);


}
