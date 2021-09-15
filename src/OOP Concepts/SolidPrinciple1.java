
public class SolidPrinciple1 
{  

	public void printDetails() 
	{  
		System.out.println("Printing Details"); 
	}                                                         //SRP Wrong
	public void calculatePercentage() 
	{  
		System.out.println("Calculating Percentage");
	}  
}  


class PrintingDetails
{
	public void printDetails() 
	{  
		System.out.println("Printing Details"); 
	}  
}

class  calculatingPercentage
{
	public void calculatePercentage() 
	{  
		System.out.println("Calculating Percentage");   //SRP Right
	}  
}

interface Shape{
	  public double calculateArea();
	}
	 
class Rectangle implements Shape{
	  double length;
	  double width;
	  public double calculateArea(){
	    return length * width;                          //Open Closed Principle
	  }                                                          
	}
	 
class Circle implements Shape{
	  public double radius;
	  public double calculateArea(){
	    return (22/7)*radius*radius;
	  }
	}

class AreaCalculator{
	  public double calculateShapeArea(Shape shape){
	    return shape.calculateArea();
	  }
	}

 class check{
	 public static void main(String[] args) {
		 
		 Rectangle r1=new Rectangle();
		 r1.length=22;
		 r1.width=2;
		 AreaCalculator a1=new AreaCalculator();
		 System.out.println(a1.calculateShapeArea(r1));
	}
 }

 



