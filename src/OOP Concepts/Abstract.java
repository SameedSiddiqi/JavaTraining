abstract class Bank{    
abstract int getRateOfInterest();    
}    

class Meezan extends Bank{    
int getRateOfInterest(){
	return 5;
	}    
} 

class UBL extends Bank{    
int getRateOfInterest(){
	return 9;
	}    
}   

    
class Abstract{    
public static void main(String args[]){    
Bank b;  
b=new Meezan();  
System.out.println("Interest rate: "+b.getRateOfInterest()+" %");    
b=new UBL();  
System.out.println("Interest rate: "+b.getRateOfInterest()+" %");    
}
}    



