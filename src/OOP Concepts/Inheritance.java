class Vehicle{
	void introduce(){
		System.out.println("Hello, i am a vehicle");
	}
}

class Car extends Vehicle{
	
	void introduceCar(){
		System.out.println("Hello, i am a Car");
	}
}


class Motorcycle extends Car{
	
	void introduceMotorcycle(){
		System.out.println("Hello, i am a MotorCycle");
	}
}

public class Inheritance {                                           //Multilevel Inheritance
	

	public static void main(String[] args) {
		Motorcycle m=new Motorcycle();


		m.introduceMotorcycle();
		m.introduceCar();
		m.introduce();
		
	}

}
