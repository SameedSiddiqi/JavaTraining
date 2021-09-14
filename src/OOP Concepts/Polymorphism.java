class Bike{  
  void run(){
	  System.out.println("running");
	  }  
}  
class Moto extends Bike{  
@Override
  void run(){
	  System.out.println("running Fast");
	  }  
  }
  


public class Polymorphism {

	public static void main(String[] args) {
		 Bike b = new Moto();
		    b.run();  

	}

}
