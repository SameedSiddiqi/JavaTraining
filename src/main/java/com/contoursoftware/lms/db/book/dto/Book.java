package main.java.com.contoursoftware.lms.db.book.dto;

public class Book {

		private String name;
		private int id;
		private String author;
		private String category;
		
		public Book(String name, int id, String author, String category) {
			this.name = name;
			this.id = id;
			this.author = author;
			this.category = category;
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
		public String getCategory() {
			return category;
		}
		public void setCategory(String category) {
			this.category = category;
		}
		
	}

