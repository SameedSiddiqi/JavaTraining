//package com.contoursoftware.obs.db.order.Dao;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.sql.Timestamp;
//import java.util.List;
//
//import com.contoursoftware.obs.commons.db.config.DatabaseConnection;
//import com.contoursoftware.obs.commons.db.dao.DataAccessObject;
//import com.contoursoftware.obs.db.book.dao.DbBookDao;
//import com.contoursoftware.obs.db.book.dto.BookDto;
//import com.contoursoftware.obs.db.customer.dto.CustomerDto;
//import com.contoursoftware.obs.db.order.Dto.OrderDto;
//import com.contoursoftware.obs.db.order_detail.Dao.OrderDetailDao;
//
//public class OrderDao implements DataAccessObject<OrderDto> {
//	
//	Connection connection = DatabaseConnection.getConnection();
// 
//
//	@Override
//	public void add(OrderDto obj) {
//		//LocalDateTime myTime2=LocalDateTime.now();
//				//DateTimeFormatter mytime3= DateTimeFormatter.ofPattern("YYYY-MM-DD hh:mm:ss");
//				//String formattedDate = myTime2.format(mytime3);
//				//System.out.println(formattedDate);
//				Timestamp timestamp = new Timestamp(System.currentTimeMillis());
//				System.out.println(timestamp);
//				//java.util.Date date = new Date(3);
//				//pst.setTimestamp(columIndex, new java.sql.Timestamp(date.getTime()).getTime());
//				
//				//Date CreatedDate= new Date(System.currentTimeMillis());
//				
//				
//				try {
//					int i;
//					Statement stmt = connection.createStatement();
//					ResultSet rs = stmt.executeQuery("SELECT id FROM customer where name= '"   +  obj.getName() + "'"); 
//					if(rs.next())
//					{
//						
//					int id=rs.getInt("id");
//					 
//					
//					PreparedStatement ps = connection.prepareStatement("INSERT INTO java_obl.order VALUES (default, ?, ?)"); 
//					ps.setInt(1, id);
//					ps.setTimestamp(2, timestamp);
//		//Saving 
//				     i = ps.executeUpdate();
//					}
//					
//					else
//					{
//						
//						String id=null;
//						 
//						
//						PreparedStatement ps = connection.prepareStatement("INSERT INTO java_obl.order VALUES (default, ?, ?)"); 
//						ps.setString(1, id);
//						ps.setTimestamp(2, timestamp);
//			//Saving 
//						 i = ps.executeUpdate();
//					}
//					
//
//					if(i == 1) {
//						Statement stmt1 = connection.createStatement();
//						ResultSet rs1 = stmt1.executeQuery("SELECT order_id FROM java_obl.order ORDER BY order_id DESC LIMIT 1"); 
//						rs1.next();
//						int o_id=rs1.getInt("order_id");
//						System.out.println("Insertion Successfull");
//						System.out.println(o_id);
//						
//						for(int j=0;j<obj.getBook().size();j++)
//						{
//							try {
//								Statement stmt2 = connection.createStatement();
//								ResultSet rs2 = stmt2.executeQuery("SELECT id FROM book where title= '"   +  obj.getBook().get(j).getTitle() + "'");
//								rs2.next();
//								int b_id=rs2.getInt("id");
//								
//								PreparedStatement ps = connection.prepareStatement("INSERT INTO order_detail VALUES (?, ?, ?,?)");
//								ps.setInt(1, o_id);
//								ps.setInt(2, b_id);
//								ps.setString(3, obj.getBook().get(j).getTitle());
//								ps.setInt(4,obj.getBook().get(j).getCopies());
//					//Saving 
//								int i1 = ps.executeUpdate();
//
//								if(i1 == 1) {
//									System.out.println("Insertion Successfull");
//								}
//								else
//								{
//									System.out.println("Insertion Not Successfull");
//								}
//
//							} catch (SQLException ex) {
//								ex.printStackTrace();
//							}
//						}
//					}
//					else
//					{
//						System.out.println("Insertion Not Successfull");
//					}
//
//				} catch (SQLException ex) {
//					ex.printStackTrace();
//				}
//		
//	}
//
//	@Override
//	public List<OrderDto> getAll() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public void update(OrderDto obj) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void delete(OrderDto obj) {
//		// TODO Auto-generated method stub
//		
//	}
//}
