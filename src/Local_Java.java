import java.util.*;  
public class Local_Java   
{  
   public static void main(String[] args)   
   {  
  
      Locale locale1 = new Locale("en","Pakistan"); 
 
      System.out.println("Locale: " + locale1);  
  
     
      System.out.println("Language: " + locale1.getDisplayLanguage());  
      
      System.out.println("Language: " + locale1.getCountry()); 
    
         
      System.out.println("HashCode for this locale: " + locale1.hashCode());
      
      Locale []availableLocale = Locale.getAvailableLocales();
		for(Locale aLocale : availableLocale){
			if(aLocale.getDisplayCountry()=="Pakistan")
			{
			System.out.println("\n\nName of Locale: "+aLocale.getDisplayName());
			System.out.println("Language Code: "+aLocale.getLanguage()+", Language Display Name: "+aLocale.getDisplayLanguage());
			System.out.println("Country Code: "+aLocale.getCountry()+", Country Display Name: "+aLocale.getDisplayCountry()+"  HashCode for this locale: " + locale1.hashCode());
			
			}
		}
      
      
      
      
   }  
}  