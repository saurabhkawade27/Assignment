package language.basics;

public class HelloWorld {
	
	public static void main(String[] args) {
		
		// There are multiple ways to print statments in java
		
		
		//1.Print the information and go to the next line.
		System.out.println("Hello, World!");
		
		//2.Print the information and stay on the same line.
		System.out.print("Hello, ");
		System.out.print("World!");
		System.out.println();
		
		//3.Print the dynamic and formatted content and stay on the same line.
		System.out.println("Deep is completed B.Tech and employee ID is 1234 and visa status is true");
		System.out.println("Prabhu is completed B.Tech and employee ID is 1235 and visa status is false");
		
		
		// %s ==> String 
		// %d ==> digit
		// %b ==> boolean
		// %f ==> float value ==> value with decimals
		// Instead of println we are using printf and providing dynamic values 
		System.out.printf("%s is completed B.Tech and employee ID is %d and visa status is %b","Pavithra", 1238, false);
		System.out.println();
		
		double price = 199.49729;
		double price1 = 199.49729231;
		System.out.printf("Price is : %.3f",price);   // %.3f indicates 3 values after decimal value
		System.out.println();
		System.out.printf("Price1 is : %.4f",price1);
		System.out.println();
		
		//4.Print the error message.
		System.err.println("Hey man, there is an error in line number 31. Please check once.");
		System.out.println();
		
		//5.Print a multi-line message.
		System.out.println();
		System.out.println("""
				    My name is Prabhu.
					My qualification is MCA
					My role is Quality Engineer """);
		System.out.println();
	}

}

