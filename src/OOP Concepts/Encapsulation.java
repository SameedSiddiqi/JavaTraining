

class Encapsulation1 {
	
	String name;
	int age;
	
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
	
			if (age<0) {
				System.out.println("Age cannot be negative");
			}
			else
			this.age = age;
		}
	
	}


	public class Encapsulation {
	

	public static void main(String[] args) {
		 Encapsulation1 e = new Encapsulation1();
		 e.setName("sameed");
		 e.setAge(-23);
		 System.out.println(e.getAge());
		 System.out.println(e.getName());
		 

	}



}
