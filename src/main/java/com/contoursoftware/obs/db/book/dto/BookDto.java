package main.java.com.contoursoftware.obs.db.book.dto;

public class BookDto {
	
	public enum Category{
		Action,
		Adventure,
		Comic,
		Education,
		Fantasy,
		History,
		Horror,
		Love
	}
	
	    private int  id;
		private String title;
		private String author;
		private Category category;
		private int copies;
		
		public BookDto(int id,String title, String author, Category category,int copies) {
			this.title = title;
			this.id = id;
			this.author = author;
			this.category = category;
			this.copies=copies;
		}
		
		public BookDto() {
		}

		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
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
		public Category getCategory() {
			return category;
		}
		public void setCategory(Category category) {
			this.category = category;
		}

		public int getCopies() {
			return copies;
		}

		public void setCopies(int copies) {
			this.copies = copies;
		}

		@Override
		public String toString() {
			return "BookDto [title=" + title + ", id=" + id + ", author=" + author + ", category=" + category
					+ ", copies=" + copies + "]";
		}

		
	}

