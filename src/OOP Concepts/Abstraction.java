class MakeMaggi{
	
	public void letsmakeMaggi()
	{
		boilwater();
		addMasala();
		Garnish();
	}
	
	private void boilwater()
	{
		System.out.println("Adding and Boiling Water");
	}
	
	
	private void addMasala()
	{
		System.out.println("Adding Masala");
	}
	
	
	private void Garnish() {
		System.out.println("Garnishing");
	}
}


public class Abstraction {

	public static void main(String[] args) {
		MakeMaggi maggi =new MakeMaggi();
		maggi.letsmakeMaggi();

	}

}
