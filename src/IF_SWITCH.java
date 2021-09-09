
public class IF_SWITCH {

	public static void main(String[] args)
	{

		int value = 9;

		switch(value) {
		
		case     0 : System.out.println("value is  0");
		break;
		case     5 : System.out.println("value is  5"); 
		break;
		case    10 : System.out.println("value is 10"); 
		break;
		default    : System.out.println("value is something else");
		
		}
	
	
	if     (value == 0) 
	{ System.out.println("value is 0"); }
	else if(value == 5) 
	{ System.out.println("value is 5"); }
	else if(value == 10)
	{ System.out.println("value is 10"); }
	
	else                 
	System.out.println("value is something else");
	}
}
