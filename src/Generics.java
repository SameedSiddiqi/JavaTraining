class generic <T1,T2>{
	
	 private int number;
	 private T1 t1;
	 
	 public T1 getT1() {
		return t1;
	}

	public void setT1(T1 t1) {
		this.t1 = t1;
	}

	public T2 getT2() {
		return t2;
	}

	public void setT2(T2 t2) {
		this.t2 = t2;
	}

	private T2 t2;
	
	 public int getNumber() {
		return number;
	}
	 
	public void setNumber(int number) {
		this.number = number;
	}
	
	
}



public class Generics {

	
	public static <T> void printArray( T[] array ) {
		
		for(T element : array) {
			System.out.printf("%s ", element);
		}
		System.out.println();
	}

	public static void main(String args[]) {
		Integer[] intArray = { 1, 2, 3, 4, 5 };
		Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
		Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

		System.out.println("Array integerArray contains:");
		printArray(intArray); 

		System.out.println("\nArray doubleArray contains:");
		printArray(doubleArray);  

		System.out.println("\nArray characterArray contains:");
		printArray(charArray); 
		
		generic <Integer,Double> g2= new generic();
		g2.setNumber(22);
		g2.setT1(11);
		g2.setT2(12.5);
		System.out.println(g2.getNumber());
		System.out.println(g2.getT1());
		System.out.println(g2.getT2());
		
		
		
		
	}
}


