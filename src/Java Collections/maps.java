import java.util.*;
public class maps {

	public static void main(String[] args) {
		Map<Integer,String> m1=new HashMap<Integer,String>();   //HashMap
		m1.put(1,"Sameed");
		m1.put(3,"Sir Ali");
		m1.put(2,"Shehryar");
		m1.put(7,"khan");
		m1.put(4,"bahadur");

		for(Map.Entry m:m1.entrySet()){  
			System.out.println(m.getKey()+" "+m.getValue());  
		}  

		for (int i=1;i<=m1.size();i++)
		{
			System.out.println(m1.get(i));  
		}

		m1.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println); 
		m1.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);  


		LinkedHashMap<Integer, String> lmap = new LinkedHashMap<Integer, String>();       //LinkedHashMap    
		lmap.put(10,"jk");     
		lmap.put(20,"hk");    
		lmap.put(30,"sk");    
		System.out.println("Keys "+lmap.keySet());   
		System.out.println("Value "+lmap.values());  
		System.out.println("KeyValue pairs "+lmap.entrySet()); 



		TreeMap<Integer,String> tmap=new TreeMap<Integer,String>();     //Treemap
		tmap.put(10,"jk");     
		tmap.put(20,"hk");    
		tmap.put(30,"sk");     
		System.out.println("Before invoking remove() method");  
		for(Map.Entry m:tmap.entrySet())  
		{  
			System.out.println(m.getKey()+" "+m.getValue());      
		}  
		tmap.remove(20);       
		for(Map.Entry m:tmap.entrySet())  
		{  
			System.out.println(m.getKey()+" "+m.getValue());      
		}  

	}

}
