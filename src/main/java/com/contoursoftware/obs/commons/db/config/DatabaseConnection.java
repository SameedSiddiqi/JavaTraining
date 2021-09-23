package main.java.com.contoursoftware.obs.commons.db.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DatabaseConnection {
	
	    public static final String URL = "jdbc:mysql://localhost:3306/java_obl?useSSL=false";
	    public static final String USER = "root";
	    public static final String PASS = "sameed123";
	  
	    private static Connection con = null;
	    
	    static 
	    {
	        try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            con = DriverManager.getConnection(URL, USER, PASS);
	        }
	        catch (ClassNotFoundException | SQLException e) {
	            e.printStackTrace();
	        }
	    }
	    public static Connection getConnection()
	    {
	        return con;
	    }
}
