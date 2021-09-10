class NegativeException extends Exception{

	public NegativeException(String str) {
		System.out.println(str);
	}

}


public class ExceptionHandling{

	public static float area(int l,int b) throws NegativeException
	{
		if (l<=0||b<=0)
		{
			throw new NegativeException("Length or breadth cannot be negative");
		}
		else
		{
			return (l*b);
		}
	}

	public static void main(String[] args) {
		try
		{
			float ans=area(-1,4); 
			System.out.print(ans); 
		}

		catch(NegativeException e)
		{
			System.out.print(e); 
		}


	}

}
