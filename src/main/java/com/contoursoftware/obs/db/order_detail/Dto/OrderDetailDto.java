package com.contoursoftware.obs.db.order_detail.Dto;

import java.awt.print.Book;

import com.contoursoftware.obs.db.order.Dto.OrderDto;

public class OrderDetailDto {
  
    private OrderDto orderId;
    private Book bookId;
    private Book bookName;
    private Book bookPrice;
    private Book bookQuantity;
    
    
	public OrderDetailDto(OrderDto orderId, Book bookId, Book bookName, Book bookPrice, Book bookQuantity) {

		this.orderId = orderId;
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.bookQuantity = bookQuantity;
	}
	
	
	public OrderDetailDto() {
		
	}


	public OrderDto getOrderId() {
		return orderId;
	}
	public void setOrderId(OrderDto orderId) {
		this.orderId = orderId;
	}
	public Book getBookId() {
		return bookId;
	}
	public void setBookId(Book bookId) {
		this.bookId = bookId;
	}
	public Book getBookName() {
		return bookName;
	}
	public void setBookName(Book bookName) {
		this.bookName = bookName;
	}
	public Book getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(Book bookPrice) {
		this.bookPrice = bookPrice;
	}
	public Book getBookQuantity() {
		return bookQuantity;
	}
	public void setBookQuantity(Book bookQuantity) {
		this.bookQuantity = bookQuantity;
	}
    
}
