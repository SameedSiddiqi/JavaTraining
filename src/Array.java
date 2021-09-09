
public class Array {

	public static void main(String[] args)
	{

		int[] array=new int[10];
		
		for(int i=0;i<array.length;i++) //For loop
		{
			array[i]=i;
		}
		
		for(int item : array)
		{
			System.out.println(item); //Enhanced For loop

		}

	}
}
