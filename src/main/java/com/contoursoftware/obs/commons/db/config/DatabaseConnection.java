package com.contoursoftware.obs.commons.db.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.contoursoftware.obs.commons.utils.AlreadyExistException;
import com.contoursoftware.obs.commons.utils.DbException;


public class DatabaseConnection  {
	
	private static DatabaseConnection instance = new DatabaseConnection();

	private static Connection connect;
	
   public static final String URL = "jdbc:mysql://localhost:3306/java_obl?useSSL=false";
   public static final String USER = "root";
   public static final String PASS = "sameed123";


	private DatabaseConnection() {

	}

	public static DatabaseConnection getInstance() {
	return instance;
	}

	public static  Connection getConnection() throws DbException {


	if(connect == null)
	{
	try
	{
	 Class.forName("com.mysql.cj.jdbc.Driver");
	connect = DriverManager.getConnection(URL, USER, PASS);

	}
	catch(Exception e) {
	throw new DbException();
	}
	}

	return connect;
	}
}
	
//	    public static final String URL = "jdbc:mysql://localhost:3306/java_obl?useSSL=false";
//	    public static final String USER = "root";
//	    public static final String PASS = "sameed123";
//	  
//	    private static Connection con = null;
//	    
//	    static 
//	    {
//	        try  {
//	            Class.forName("com.mysql.cj.jdbc.Driver");
//	            con = DriverManager.getConnection(URL, USER, PASS);
//	        }
//	        catch (ClassNotFoundException | SQLException e) {
//	            e.printStackTrace();
//	        }
//	    }
//	    public static Connection getConnection()
//	    {
//	        return con;
//	    }
//}
