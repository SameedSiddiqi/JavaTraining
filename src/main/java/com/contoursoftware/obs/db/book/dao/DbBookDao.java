package main.java.com.contoursoftware.obs.db.book.dao;

import java.util.ArrayList;

import java.util.List;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import main.java.com.contoursoftware.obs.commons.db.config.DatabaseConnection;
import main.java.com.contoursoftware.obs.commons.db.dao.DataAccessObject;
import main.java.com.contoursoftware.obs.db.book.dto.BookDto;
import main.java.com.contoursoftware.obs.db.book.dto.BookDto.Category;

public class DbBookDao implements DataAccessObject<BookDto> {

	Connection connection = DatabaseConnection.getConnection();

	private BookDto extractBookFromResultSet(ResultSet rs) throws SQLException {
		BookDto book=new BookDto();

		book.setId( rs.getInt("id") );
		book.setTitle( rs.getString("title") );
		book.setAuthor( rs.getString("author") );
		book.setCategory(Category.valueOf(rs.getString("category")));

		return book;
	}

	//	public static void main(String[] args) {
	//	      String JdbcURL = "jdbc:mysql://localhost:3306/java_obl?useSSL=false";
	//	      String Username = "root";
	//	      String password = "sameed123";
	//	      String query="select * from test";
	//	  
	//	      try {
	//	    	  
	//	    	  Class.forName("com.mysql.cj.jdbc.Driver");
	//	    	  Connection con=DriverManager.getConnection(JdbcURL, Username, password);
	//	    	  Statement st=con.createStatement();
	//	    	  ResultSet rs=st.executeQuery(query);
	//	    	  
	//	    	  while(rs.next())
	//	    	  {
	//	    		 Array data=rs.getArray(1);
	//	    		 System.out.println(data);
	//	    	  }
	//	    	  
	//	    	  st.close();
	//	    	  rs.close();
	//	      }
	//	      catch(Exception e) {
	//	         e.printStackTrace();
	//	      }
	//	   }
	@Override
	public void add(BookDto obj) {
		try {
			PreparedStatement ps = connection.prepareStatement("INSERT INTO book VALUES (default, ?, ?, ?,?)");
			ps.setString(1, obj.getTitle());
			ps.setString(2, obj.getAuthor());
			ps.setString(3, obj.getCategory().name());
			ps.setInt(4, obj.getCopies());

			int i = ps.executeUpdate();

			if(i == 1) {
				System.out.println("Insertion Successfull");
			}
			else
			{
				System.out.println("Insertion Not Successfull");
			}

		} catch (SQLException ex) {
			ex.printStackTrace();
		}

	}

	@Override
	public List<BookDto> getAll() {
		// TODO Auto-generated method stub
		try {
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM book");

			List<BookDto> books = new ArrayList<BookDto>();

			while(rs.next())
			{
				BookDto book = extractBookFromResultSet(rs);
				books.add(book);
			}

			return books;

		} catch (SQLException ex) {
			ex.printStackTrace();
		}

		return null;
	}

	@Override
	public void update(BookDto obj) {
		try {
			PreparedStatement ps = connection.prepareStatement("UPDATE book SET category=? WHERE id=?");
			ps.setString(1, obj.getCategory().name());
			ps.setInt(2, obj.getId());
			int i = ps.executeUpdate();

			if(i == 1) {
				System.out.println("Update Successfull");
			}
			else
			{
				System.out.println("Update not successfull");
			}

		} catch (SQLException ex) {
			ex.printStackTrace();
		}

	}

	@Override
	public void delete(BookDto obj) {
		try {
			Statement stmt = connection.createStatement();
			int i = stmt.executeUpdate("DELETE FROM book WHERE id=" + obj.getId());

			if(i == 1) {
				System.out.println("Deletion Successsfull");
			}
			else
			{
				System.out.println("Deletion not successfull");
			}
		}
			catch (SQLException ex) {
				ex.printStackTrace();
			}
		}

	}

