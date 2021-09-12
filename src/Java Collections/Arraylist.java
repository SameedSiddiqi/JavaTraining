
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Arraylist {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("abc");
		list.add("def");
		list.add("ghi");
		list.add("jkl");

		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(7);
		list1.add(4);
		list1.add(5);

		Iterator<String> itr=list.iterator();  //Printing through iterator
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}


		for(Integer my:list1)
		{
			System.out.println(my);                   //Printing through enhanced for

		}

		Collections.sort(list1);
		for(Integer number:list1)                    //Sorting
			System.out.println(number);


		for(int i=list1.size()-1;i>=0;i--)
		{
			System.out.println(list1.get(i));               //Reverse
		}


	}

       


}


