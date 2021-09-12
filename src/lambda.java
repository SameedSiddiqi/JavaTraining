import java.util.*;

 interface Addable{  
	    int add(int a,int b);  
	}  
	  
  class myLambda {  
	    public static void main(String[] args) {  
	          
	        Addable ad1=(a,b)->(a+b);  
	        System.out.println(ad1.add(100,300));  
	           
	    }  
	}  
 
 

public class lambda {
	
	public static void main(String[] args) {
	    ArrayList<Integer> numbers = new ArrayList<Integer>();
	    numbers.add(55);
	    numbers.add(12);
	    numbers.add(43);
	    
	    numbers.forEach(
	    		(n)->{
	    			System.out.println(n);
	    			}
	    		);
	    
	  }

}
