import java.util.*;  
public class linklist{  
 public static void main(String args[]){  
  
  LinkedList<Double> al=new LinkedList<Double>();  
  al.add(7.8);  
  al.add(3.5);  
  al.add(2.8);  
  al.add(9.7);  
  
  
  LinkedList<Double> al2=new LinkedList<Double>();  
  al2.add(22.1);  
  al2.add(33.2);  
  al2.add(44.3);  
  al2.add(55.4); 
  
  Iterator<Double> itr=al.iterator();  
  while(itr.hasNext()){  
   System.out.println(itr.next());  
  }  
  
  al.add(1, 1.2);
  al2.add(0,11.0);
  
  System.out.println(al);
  
  
  al2.addAll(2, al);
  
  System.out.println(al2);
  

  
  
 }  
}  