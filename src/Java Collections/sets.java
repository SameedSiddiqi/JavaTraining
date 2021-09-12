import java.util.*;
public class sets {

	public static void main(String[] args) {

		HashSet <String> hash=new HashSet<String>();    //hashset 
		hash.add("ali");
		hash.add("usman");
		hash.add("khan");

		System.out.println(hash);

		hash.remove("usman");

		System.out.println(hash);


		List <String> list=new LinkedList<String>();       //Program to remove duplicate from list
		list.add("khan");
		list.add("Siddiqi");
		list.add("khan");
		System.out.println(list);

		HashSet <String> hash1=new HashSet<String>(list);
		System.out.println(hash1);

		list.clear();
		list.addAll(hash1);
		
		
		HashSet <String> hash2=new LinkedHashSet<String>();    //linkedhashset 
		hash2.add("a");
		hash2.add("b");
		hash2.add("c");
		
		System.out.println(hash2);
		
		
		TreeSet<Integer> set=new TreeSet<Integer>();              //Treeset
        set.add(11);  
        set.add(55);  
        set.add(8); 
        set.add(99); 
        set.add(6);  
         
        System.out.println(set); 
        System.out.println("Reverse "+set.descendingSet()); 
        System.out.println("Low: "+set.pollFirst());  
        System.out.println("High: "+set.pollLast()); 
       








	}

}
