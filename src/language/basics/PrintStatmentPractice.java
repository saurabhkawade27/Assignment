package language.basics;

public class PrintStatmentPractice {

	public static void main(String[] args) {

		System.out.println("Hello There"); // by using println

		System.out.print("Welcome to Basics "); // by using print statement
		System.out.print("Of Java.");

		// By using dynamic method ( For that we need to use printf and %s,%d,%b as per
		// data )
		System.out.println();
		System.out.printf("%s has scored %d percent in Engineering in %d Year", "Saurabh", 80, 2021);

		// %s ==> String %d ==> digit %b ==> boolean %f ==> float value ==> value with
		// decimals

		// We can also use to round off value
		double num = 8329.212191;
		System.out.println();
		System.out.printf("%.3f", num);

		// Print error message
		System.out.println();
		System.err.println("This print method used to print error message");

		// print multilines
		System.out.println("""
				This is My country
				India
				""");

	}

}
