
interface Aeroplane{  
	void speed(); 
	void fuelAverage();  
	void GunCapacity();    
}  

abstract class F17lite implements Aeroplane{
	public void speed() {
		System.out.println("Speed 1200 km/hr");		
	}

	public void fuelAverage() {
		System.out.println("10km/L");	
	}
}

class F17 extends F17lite
{
	public void GunCapacity() {

		System.out.println("300 bullets");	
	}
}

public class Interface{    
	public static void main(String args[]){    
                F17 f17=new F17();
                f17.fuelAverage();
                f17.GunCapacity();
                f17.speed();
	}
}    
