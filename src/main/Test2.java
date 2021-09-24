package main;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import main.java.com.contoursoftware.obs.db.admin.dto.AdminDto;
import main.java.com.contoursoftware.obs.db.book.dto.BookDto;

import main.java.com.contoursoftware.obs.db.category.dto.CategoryDto;
import main.java.com.contoursoftware.obs.db.customer.dto.CustomerDto;
import main.java.com.contoursoftware.obs.ui.admin.controller.AdminAddBook;
import main.java.com.contoursoftware.obs.ui.admin.controller.AdminDeleteBook;
import main.java.com.contoursoftware.obs.ui.admin.controller.AdminGetBook;
import main.java.com.contoursoftware.obs.ui.admin.controller.AdminGetCategory;
import main.java.com.contoursoftware.obs.ui.admin.controller.AdminUpdateBook;
import main.java.com.contoursoftware.obs.ui.admin.controller.SearchBook;
import main.java.com.contoursoftware.obs.ui.student.controller.AddCustomer;
import main.java.com.contoursoftware.obs.ui.student.controller.DeleteCustomer;
import main.java.com.contoursoftware.obs.ui.student.controller.GetAllCustomer;


public class Test2 {

	

	public static void main(String[] args) {
		List<CategoryDto> list=new ArrayList<CategoryDto>();
		CategoryDto categorydto1 =new CategoryDto(1, "Action");
		CategoryDto categorydto2 =new CategoryDto(2, "Adventure");
		CategoryDto categorydto3 =new CategoryDto(3, "Autobiography");
		
		
		list.add(categorydto1);
		list.add(categorydto2);
		list.add(categorydto3);
		
		BookDto addBook=new BookDto(0, "Java", "Lewandoski",list, 1);
		BookDto addBook1=new BookDto( 1,"Python", "Sane", list, 1);
		BookDto addBook2=new BookDto(2,"Avengers",  "Ruso Brothers", list, 1);
		BookDto addBook3=new BookDto(3, "Friends",  "Sahir Lodhi", list, 1);
		AdminAddBook adminAddBook=new AdminAddBook();
		adminAddBook.performAction(addBook);
		adminAddBook.performAction(addBook1);
		adminAddBook.performAction(addBook2);
		adminAddBook.performAction(addBook3);
		
		AdminGetBook adminGetBook = new AdminGetBook();
		System.out.println("Getting All Books");
		System.out.println(adminGetBook.performAction());
		
		AdminUpdateBook adminUpdateBook=new AdminUpdateBook(); 
		BookDto u1=new BookDto(3, null,"sameed", null, 0);
		adminUpdateBook.performAction(u1);
		System.out.println(adminGetBook.performAction());
		
		
		
		AdminGetCategory admingetCategory = new AdminGetCategory();
		System.out.println(admingetCategory.performAction());
		
		 


		//List<BookDto> l2 = adminGetBook.performAction().stream().filter(p -> p.getName().equals("Python")).collect(Collectors.toList());
		//BookDto[] array = l2.toArray(new BookDto()[l2.size()]);
		//Object[] o = l2.toArray();



		

		AdminDeleteBook adminDeleteBook=new AdminDeleteBook(); //Delete by name
		BookDto d1=new BookDto(1,null, null, null, 0);
		adminDeleteBook.performAction(d1);
		System.out.println(adminGetBook.performAction());

		//SearchBook searchBook=new SearchBook();
		//System.out.println(searchBook.performNewAction("Java"));
		
		
//		CustomerDto student=new CustomerDto(0, "Sameed", "Peshawar", "03361930015", "sameed@gmail.com", "sameed123");
//		CustomerDto student1=new CustomerDto(1, "Talha", "Lahore", "03151930015", "talha@gmail.com", "talha123");
//		CustomerDto student2=new CustomerDto(2, "khalid", "Karachi", "03231930015", "khalid@gmail.com", "khalid123");
//		AddCustomer addStudent=new AddCustomer();
//		addStudent.performAction(student);
//		addStudent.performAction(student1);
//		addStudent.performAction(student2);
//		
//		GetAllCustomer getAllCustomer=new GetAllCustomer();
//		System.out.println(getAllCustomer.performAction());
//		
//		DeleteCustomer deleteCustomer=new DeleteCustomer();
//		CustomerDto sd1=new CustomerDto(1, null, null, null, null, null);
//		deleteCustomer.performAction(sd1);
//		System.out.println(getAllCustomer.performAction());


		//		AdminDto myadmin = new AdminDto(0, "Sammed Siddiqi", "sameed123@gmail.com", "sameed123");
		//		AdminLogin adminLogin=new AdminLogin();
		//		adminLogin.performAction(myadmin);
		//		
		//
		//		
		//		BookDto addBook=new BookDto("Java", 0, "Lewandoski", "Programming", 1);
		//		BookDto addBook1=new BookDto("Python", 1, "Sane", "Human Interface", 1);
		//		BookDto addBook2=new BookDto("C++", 2, "Haland", "Coding", 1);
		//		BookDto addBook3=new BookDto("React", 3, "Mane", "FrontEnd", 1);
		//		AdminAddBook adminAddBook=new AdminAddBook();
		//		adminAddBook.performAction(addBook);
		//		adminAddBook.performAction(addBook1);
		//		adminAddBook.performAction(addBook2);
		//		adminAddBook.performAction(addBook3);
		//		
		//		AdminGetBook adminGetBook = new AdminGetBook();
		//		System.out.println("Getting All Books");
		//		System.out.println(adminGetBook.performAction());
		//		
		//		
		//		SearchBook searchBook=new SearchBook();
		//		BookDto b1=null;
		//		b1=searchBook.performNewAction("Python");
		//		System.out.println("Searching Book by name");
		//		System.out.println(b1);
		//		
		//		//List<BookDto> l2 = adminGetBook.performAction().stream().filter(p -> p.getName().equals("Python")).collect(Collectors.toList());
		//		//System.out.println(l2);
		//		
		//		
		//		AdminDeleteBook adminDeleteBook=new AdminDeleteBook(); //Delete by name
		//		adminDeleteBook.performAction("Python");
		//		System.out.println(adminGetBook.performAction());
		//		
		//		AdminUpdateBook adminUpdateBook=new AdminUpdateBook(); //Delete by Category
		//		adminUpdateBook.performAction("Java","OOP");
		//		System.out.println(adminGetBook.performAction());
		//		
		//	
		//		
	}

}
