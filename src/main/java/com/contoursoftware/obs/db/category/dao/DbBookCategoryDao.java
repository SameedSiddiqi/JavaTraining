package com.contoursoftware.obs.db.category.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.contoursoftware.obs.commons.db.config.DatabaseConnection;
import com.contoursoftware.obs.commons.db.dao.DataAccessObject;
import com.contoursoftware.obs.commons.utils.DbException;
import com.contoursoftware.obs.db.book.dto.BookDto;
import com.contoursoftware.obs.db.category.dto.CategoryDto;

public class DbBookCategoryDao implements  DataAccessObject<BookDto> {
	

	
	private BookDto extractBookFromResultSet(ResultSet rs) throws SQLException {
		List<CategoryDto> list=new ArrayList<CategoryDto>();
		CategoryDto c1=new CategoryDto(rs.getInt(5),rs.getString(6));
		list.add(c1);
		BookDto book=new BookDto();

		book.setId( rs.getInt(1) );
		book.setTitle( rs.getString(2) );
		book.setAuthor( rs.getString(3) );
		book.setAuthor(rs.getString(4));
		book.setCategory(list);
		//book.setCategory(Category.valueOf(rs.getString("category")));

		return book;
	}

	@Override
	public void add(BookDto obj) throws DbException {
		try {
			Connection connection = DatabaseConnection.getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT id FROM book where title= '"    +  obj.getTitle() + "'");
			rs.next();
			int i=rs.getInt("id");
			System.out.println(i);
			 PreparedStatement ps = null;
			for(int j=0;j<obj.getCategory().size();j++)
			{
				System.out.println(obj.getCategory().get(j).getId());
	         ps = connection.prepareStatement("INSERT INTO book_category VALUES (?,?)");
			ps.setInt(1, i);
			ps.setInt(2,obj.getCategory().get(j).getId());

			int f = ps.executeUpdate();

			if(f == 1) {
				System.out.println("Insertion Successfull");
			}
			else
			{
				System.out.println("Insertion Not Successfull");
			}
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}

		
	}

	@Override
	public List<BookDto> getAll() {
		try {
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("Select b.*,c.* from book b Join book_category bc on b.id=bc.b_id join category  c on c.id=bc.c_id;");

			List<BookDto> bookCategory = new ArrayList<BookDto>();

			while(rs.next())
			{
				BookDto book = extractBookFromResultSet(rs);
			    bookCategory.add(book);
			}
			return bookCategory;
		}

		 catch (SQLException ex) {
			ex.printStackTrace();
		}

		return null;
	}

	@Override
	public void update(BookDto obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(BookDto obj) {
		// TODO Auto-generated method stub
		
	}

}
