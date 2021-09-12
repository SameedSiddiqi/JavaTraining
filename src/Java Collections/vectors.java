import java.util.*;
public class vectors {

	public static void main(String[] args) {
		 Vector<String> myvector = new Vector<String>();  
         //Adding elements using add() method of List  
         myvector.add("Tiger");  
         myvector.add("Lion");  
         myvector.add("Dog");  
         myvector.add("Elephant");   
         myvector.remove("Lion");
         System.out.println(myvector.size());
         System.out.println(myvector.capacity());
         myvector.addElement("Deer");  
         System.out.println(myvector.size());
         System.out.println(myvector.capacity());

	}

}
