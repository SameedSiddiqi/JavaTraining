
public class Operators {

	public static void main(String[] args) {

		int num1 = 2, num2 = 10, sum;
		sum = num1 + num2;                                    // Arithmetic 
		System.out.println("Sum " +sum);


		int a = 2, b = 14;
		System.out.println(a == b);  // false
		System.out.println(a != b);  // true                    //Relational                            
		System.out.println(a > b);  // false
		System.out.println(a < b);  // true


		System.out.println((5 > 3) && (8 > 5));  // true
		System.out.println((5 > 3) && (8 < 5));  // false
		System.out.println((5 < 3) || (8 > 5));  // true                //Logical
		System.out.println((5 > 3) || (8 < 5));  // true
		System.out.println((5 < 3) || (8 < 5));  // false

	}

}
