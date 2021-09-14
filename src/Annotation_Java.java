import java.lang.annotation.*;  
import java.lang.reflect.*;  


@Retention(RetentionPolicy.RUNTIME)  
@Target(ElementType.METHOD)

@interface CustomAnnotation{  
	int value();  
	String name();
}  

//Applying annotation  
class myclass{  
	
	@CustomAnnotation(value=25,name="Sameed") 
	 
	public void sayHello(){System.out.println("myannotation");
	}  
}  

//Accessing annotation  
public class Annotation_Java{  
	
	
	public static void main(String args[])throws Exception{  

		myclass h=new myclass();  
		Method m=h.getClass().getMethod("Hello");  
		CustomAnnotation manno=m.getAnnotation(CustomAnnotation.class);  
		System.out.println("value is: "+manno.value());  
	}
	}  


class Animal{  
void eating(){System.out.println("eat");}  
}  
  
class Cat extends Animal{  
@Override  
void eating(){System.out.println("eat cat food");}              //if no @override, spelling mistake will be ignored
}  
  
class Test{  
public static void main(String args[]){  
Animal a=new Cat();  
a.eating();  
}} 