package com.contoursoftware.obs.db.customer.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
//import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import com.contoursoftware.obs.commons.db.config.DatabaseConnection;
import com.contoursoftware.obs.commons.db.dao.DataAccessObject;
import com.contoursoftware.obs.commons.utils.DbException;
import com.contoursoftware.obs.commons.utils.MultipleCredential;
import com.contoursoftware.obs.commons.utils.Searchable;
import com.contoursoftware.obs.db.book.dao.DbBookDao;
import com.contoursoftware.obs.db.customer.dto.CustomerDto;

public class DbCustomerDAO implements DataAccessObject<CustomerDto>,Searchable<CustomerDto> {
	
	Connection connection = DatabaseConnection.getConnection();

	private CustomerDto extractCustomerFromResultSet(ResultSet rs) throws SQLException {
		CustomerDto customer=new CustomerDto();

		customer.setId( rs.getInt("id") );
		customer.setName( rs.getString("name") );
		customer.setAddress( rs.getString("address") );
		customer.setContact_no( rs.getString("contact_no") );
		customer.setEmail(rs.getString("email"));
		
		//customer.setCategory(Category.valueOf(rs.getString("category")));

		return customer;
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

	public void add(CustomerDto obj) throws DbException {
		try {
			PreparedStatement ps = connection.prepareStatement("INSERT INTO customer VALUES (default, ?, ?,?,?,?)");
			ps.setString(1, obj.getName());
			ps.setString(2, obj.getAddress());
			ps.setString(3, obj.getContact_no());
			ps.setString(4, obj.getEmail());
			ps.setString(5, obj.getPassword());
//Saving 
			int i = ps.executeUpdate();

			if(i == 1) {
				System.out.println("Insertion Successfull");
			}
			else
			{
				System.out.println("Insertion Not Successfull");
			}

		} catch (SQLException ex) {
			throw new DbException(ex);
		}

	}

	@Override
	public List<CustomerDto> getAll() {
		// TODO Auto-generated method stub
		try {
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM customer");

			List<CustomerDto> customers = new ArrayList<CustomerDto>();

			while(rs.next())
			{
				CustomerDto customer = extractCustomerFromResultSet(rs);
				customers.add(customer);
			}

			return customers;
			
		}

		 catch (SQLException ex) {
			ex.printStackTrace();
		}

		return null;
	}

	@Override
	public void update(CustomerDto obj) {
		try {
			PreparedStatement ps = connection.prepareStatement("UPDATE customer SET name=? WHERE id=?");
			ps.setString(1, obj.getName());
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
	public void delete(CustomerDto obj) {
		try {
			Statement stmt = connection.createStatement();
			int i = stmt.executeUpdate("DELETE FROM customer WHERE id=" + obj.getId());

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

	@Override
	public int countByCriteria(CustomerDto obj) {
		int j=0;
				try {
					Statement stmt1 = connection.createStatement();
					ResultSet rs1 = stmt1.executeQuery("SELECT count(*) FROM customer where name='"    +  obj.getName() + "' and email='"    +  obj.getEmail() + "'  ");
					rs1.next();
					
					 j=rs1.getInt(1);
					
					 return j;	
				}
				catch (SQLException ex) {
					ex.printStackTrace();
				}
		return j;

 }
	

	public void order (CustomerDto obj)
	{
		//LocalDateTime myTime2=LocalDateTime.now();
		//DateTimeFormatter mytime3= DateTimeFormatter.ofPattern("YYYY-MM-DD hh:mm:ss");
		//String formattedDate = myTime2.format(mytime3);
		//System.out.println(formattedDate);
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		System.out.println(timestamp);
		//java.util.Date date = new Date(3);
		//pst.setTimestamp(columIndex, new java.sql.Timestamp(date.getTime()).getTime());
		
		//Date CreatedDate= new Date(System.currentTimeMillis());
		
		
		try {
			int i;
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT id FROM customer where name= '"   +  obj.getName() + "'"); 
			if(rs.next())
			{
				
			int id=rs.getInt("id");
			 
			
			PreparedStatement ps = connection.prepareStatement("INSERT INTO java_obl.order VALUES (default, ?, ?)"); 
			ps.setInt(1, id);
			ps.setTimestamp(2, timestamp);
//Saving 
		     i = ps.executeUpdate();
			}
			
			else
			{
				
				String id=null;
				 
				
				PreparedStatement ps = connection.prepareStatement("INSERT INTO java_obl.order VALUES (default, ?, ?)"); 
				ps.setString(1, id);
				ps.setTimestamp(2, timestamp);
	//Saving 
				 i = ps.executeUpdate();
			}
			

			if(i == 1) {
				Statement stmt1 = connection.createStatement();
				ResultSet rs1 = stmt1.executeQuery("SELECT order_id FROM java_obl.order ORDER BY order_id DESC LIMIT 1"); 
				rs1.next();
				int o_id=rs1.getInt("order_id");
				System.out.println("Insertion Successfull");
				System.out.println(o_id);
				
				for(int j=0;j<obj.getBook().size();j++)
				{
				   DbBookDao bookdao=new DbBookDao();
				   bookdao.orderDetail(o_id,obj.getBook().get(j));
				   			
				}
			}
			else
			{
				System.out.println("Insertion Not Successfull");
			}

		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		
		
	}

	public CustomerDto getCustomer(CustomerDto obj) {
		// TODO Auto-generated method stub
		CustomerDto customer=null;
		try {
			Statement stmt1 = connection.createStatement();
			ResultSet rs1 = stmt1.executeQuery("SELECT * FROM customer where password='"    +  obj.getPassword() + "' and email='"    +  obj.getEmail() + "'  ");
			 if(rs1.next())
			 {
				  customer=new CustomerDto();

					customer.setId( rs1.getInt("id") );
					customer.setName( rs1.getString("name") );
					customer.setAddress( rs1.getString("address") );
					customer.setContact_no( rs1.getString("contact_no") );
					customer.setEmail(rs1.getString("email"));
					return customer;
			 }
	}
		catch (SQLException ex) {
			ex.printStackTrace();
		}
		return customer;
	
}
}
		