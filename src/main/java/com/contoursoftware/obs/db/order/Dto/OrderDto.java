package com.contoursoftware.obs.db.order.Dto;

import java.util.List;

import com.contoursoftware.obs.db.book.dto.BookDto;
import com.contoursoftware.obs.db.customer.dto.CustomerDto;

public class OrderDto {
	 
        private  int orderId;
        private int customerId;
        private String name;
        private List<BookDto> book;
        
    
		
		public OrderDto() {
			
		}
		public OrderDto(int orderId, int customerId, String name, List<BookDto> book) {

			this.orderId = orderId;
			this.customerId = customerId;
			this.name = name;
			this.book = book;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getOrderId() {
			return orderId;
		}
		public void setOrderId(int orderId) {
			this.orderId = orderId;
		}
		public int getCustomerId() {
			return customerId;
		}
		public void setCustomerId(int customerId) {
			this.customerId = customerId;
		}
		public List<BookDto> getBook() {
			return book;
		}
		public void setBook(List<BookDto> book) {
			this.book = book;
		}
        
}
