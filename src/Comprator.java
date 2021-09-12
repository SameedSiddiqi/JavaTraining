import java.util.*;  

class Student {    
	int rollno;    
	String name;    
	int age;  
	
	Student(int rollno,String name,int age){    
		this.rollno=rollno;    
		this.name=name;    
		this.age=age;    
	}  
	public int getRollno() {  
		return rollno;  
	}  
	public void setRollno(int rollno) {  
		this.rollno = rollno;  
	}  
	public String getName() {  
		return name;  
	}  

	public void setName(String name) {  
		this.name = name;  
	}  

	public int getAge() {  
		return age;  
	}  
	public void setAge(int age) {  
		this.age = age;  
	}  
}    
public class Comprator {

	public static void main(String[] args) {
		ArrayList<Student> al=new ArrayList<Student>();    
		al.add(new Student(4,"Ali",32));    
		al.add(new Student(2,"Usama",22));    
		al.add(new Student(7,"Sameed",23));    
		Comparator<Student> cm1=Comparator.comparing(Student::getName);   //Comparing by name
		Collections.sort(al,cm1);  
		System.out.println("Comparing by name");
		for(Student st: al){  
			
			System.out.println(st.rollno+" "+st.name+" "+st.age);  
		}  
		
		Comparator<Student> re=Comparator.comparing(Student::getName);
		Comparator<Student> rev=re.reversed();//Comparing by name
		Collections.sort(al,rev);      
		System.out.println("comparing by name reversed");       //comparing by name reversed
		for(Student st: al){  
			
			System.out.println(st.rollno+" "+st.name+" "+st.age);  
		}  
		
		
		
		Comparator<Student> cm2=Comparator.comparing(Student::getAge);  //comparing by age
		Collections.sort(al,cm2); 
		System.out.println("comparing by age");
		for(Student st: al){
			 
			System.out.println(st.rollno+" "+st.name+" "+st.age);  
		}  
	}    

}


