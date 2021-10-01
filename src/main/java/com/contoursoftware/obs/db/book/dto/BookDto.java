package com.contoursoftware.obs.db.book.dto;



import java.util.ArrayList;
import java.util.List;

import com.contoursoftware.obs.db.category.dto.CategoryDto;

public class BookDto {
	
	    private int  id;
		private String title;
		private String author;
		private List<CategoryDto> category; 
		private int copies;
		
		public BookDto(int id,String title, String author, List<CategoryDto> category,int copies) {
			this.title = title;
			this.id = id;
			this.author = author;
			this.category = category;
			this.copies=copies;
		}
		
		public List<CategoryDto> getCategory() {
			return category;
		}

		public void setCategory(List<CategoryDto> category) {
			this.category = category;
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

