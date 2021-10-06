package com.contoursoftware.obs.commons.db.config;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

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
        ClassLoader classLoader = null;
		try {
			String fileName="SQL Script/dbconfig.properties";
			
			InputStream inputStream = classLoader.getResourceAsStream(fileName);
			System.out.println( inputStream);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
       
		
		
		
	try
	{
		Properties dbconfig =new Properties();

		    //FileInputStream fis1=new FileInputStream("dbconfig.properties");
		   // System.out.println(fis1);
		FileInputStream fis=new FileInputStream("C:\\Users\\siddisam\\eclipse-pro-workspace\\OBS\\SQL Script\\dbconfig.properties"); //path /create property class
		dbconfig.load(fis);
		
		//System.out.println(dbconfig.getProperty("PASS"));
		//System.out.println(dbconfig.getProperty("URL"));
		
		
	 Class.forName("com.mysql.cj.jdbc.Driver");
	connect = DriverManager.getConnection(dbconfig.getProperty("URL"),dbconfig.getProperty("USER"),dbconfig.getProperty("PASS"));

	}
	catch(Exception e) {
	throw new DbException(e);
	}
	}

	return connect;
	}
	
	@Override  
    protected void finalize() throws DbException   
    {   
        try {
			connect.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new DbException();
		}   
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
