import java.util.*;

class Students{
	String name;
	int rollno;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
}

class Professor {
	 String name;
	 String depatment;
	 List<Students> numbers;
	 
	 public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepatment() {
		return depatment;
	}

	public void setDepatment(String depatment) {
		this.depatment = depatment;
	}

	public List<Students> getNumbers() {
		return numbers;
	}

	public void setNumbers(List<Students> numbers) {
		this.numbers = numbers;
	}

}


public class Association {

	public static void main(String[] args) {
		  Professor P1=new Professor();
		  Professor P2=new Professor();
		  P1.setName("Sir Asghar");
		  P1.setDepatment("Java");
		  P2.setName("Sir Ali");
		  P2.setDepatment("OOP");
		  
		  Students s1= new Students();
		  s1.setName("Sameed");
		  s1.setRollno(223);
		  
		  Students s2= new Students();
		  s2.setName("Saad");
		  s2.setRollno(224);
		  
		  Students s3= new Students();
		  s3.setName("Usman");
		  s3.setRollno(226);
		  
		  List<Students> n =new ArrayList<Students>();
		  n.add(s1);
		  n.add(s2);
		  n.add(s3);
		  
		  List<Students> n2 =new ArrayList<Students>();
		  n2.add(s1);
		  n2.add(s3);
		  
		  P1.setNumbers(n);
		  P2.setNumbers(n2);
		  
		  System.out.println("Students of "+ P1.getName());

		  P1.getNumbers().forEach(p-> System.out.println(p.name));  

		  System.out.println("\nStudents of "+ P2.getName());

		  P2.getNumbers().forEach(p-> System.out.println(p.name));  	  

		  

	}

}
