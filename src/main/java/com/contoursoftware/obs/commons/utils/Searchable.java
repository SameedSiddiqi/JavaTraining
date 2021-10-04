package com.contoursoftware.obs.commons.utils;
import java.util.List;


public interface Searchable<T> {
  
	 public int countByCriteria(T obj) throws DbException;

}
