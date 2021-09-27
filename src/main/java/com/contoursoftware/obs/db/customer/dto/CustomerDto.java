package main.java.com.contoursoftware.obs.db.customer.dto;

import java.util.List;

import main.java.com.contoursoftware.obs.db.book.dto.BookDto;

public class CustomerDto {
	
	private int id;
	private String name;
	private String address;
	private String contact_no;
	private String email;
	private String password;
	private List<BookDto> book;
	
	public CustomerDto(int id, String name, String address, String contact_no, String email, String password,
			List<BookDto> book) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.contact_no = contact_no;
		this.email = email;
		this.password = password;
		this.book = book;
	}
	
	public CustomerDto(int id, String name,String address, String contact_no, String email, String password) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.contact_no = contact_no;
		this.email = email;
		this.password = password;
	}
	
	
	public CustomerDto() {
		// TODO Auto-generated constructor stub
	}

	
	public List<BookDto> getBook() {
		return book;
	}

	public void setBook(List<BookDto> book) {
		this.book = book;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getContact_no() {
		return contact_no;
	}


	public void setContact_no(String contact_no) {
		this.contact_no = contact_no;
	}


	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "CustomerDto [id=" + id + ", name=" + name + ", address=" + address + ", contact_no=" + contact_no
				+ ", email=" + email + ", password=" + password + "]";
	}







}
