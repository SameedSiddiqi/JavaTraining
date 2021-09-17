package main.java.com.contoursoftware.lms.commons.db.dao;
import java.util.List;

public interface DataAccessObject<T> {

	//void add (T obj);
    List<T> getAll();

    T getOne(int obj);

    void update(T obj,String name);

    void delete(T obj);
}
