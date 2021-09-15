
class Single {

	  
	   private static Single instance = new Single();

	   
	   private Single(){}

	   public static Single getInstance(){
	      return instance;
	   }

	   public void showMessage(){
	      System.out.println("I am Singleton");
	   }
	}

public class Singleton {
	public static void main(String[] args) {
		
		Single object = Single.getInstance();

		object.showMessage();
	}
}