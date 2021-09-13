import java.util.*;
import java.util.stream.Collectors;  
public class StreamPractice {
	int id;
	String name;
	int price;

	public StreamPractice(int id, String name, int price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}




	public static void main(String[] args) {
		 List<StreamPractice> l1=new ArrayList<StreamPractice>();
		 l1.add(new StreamPractice(1,"Cd70",50000));
		 l1.add(new StreamPractice(2,"Cd110",70000));
		 l1.add(new StreamPractice(3,"Cd125",95000));
		 l1.add(new StreamPractice(4,"Cd150",1200000));
		 
		 for(StreamPractice s1:l1)
              System.out.println(s1.getPrice());
		 
		 l1.stream().filter(p->p.price>70000).forEach(p -> System.out.println(p.name)); //Filtering by price 
		 
		Integer totalPrice = l1.stream()  
				 .map(product->product.price)  
				 .reduce(0,(sum, price)->sum+price);        //Sum by reduce
		 System.out.println(totalPrice);   
		 
		 float count = l1.stream()  
				 .filter(product->product.price<95000)  
				 .count();                                             //count
		 System.out.println(count); 
		 
		 List<Integer> productPriceList =   
	               l1.stream() .filter(p -> p.price > 100000).map(p->p.getPrice()).collect(Collectors.toList());  
	        System.out.println(productPriceList);  
		 
	}

}
