
public class stringbuffer_builder {

	public static void main(String[] args) {
		StringBuffer str=new StringBuffer("Sameed");
		System.out.println(str);
		
		str.append(" Siddiqi");
		System.out.println(str);
		
		str.insert(0,"Muhammad ");
		System.out.println(str);
		
		str.delete(9,16);
		System.out.println(str);
		
		System.out.println(str.reverse());
		
			
		

	}

}
