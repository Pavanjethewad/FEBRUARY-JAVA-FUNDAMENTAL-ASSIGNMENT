package assignment_week2;
import java.util.Scanner;
public class FahrenheitToCelsius {

	public static void main(String[] args) {
		  Scanner input = new Scanner(System.in);

	        System.out.print("Input in Fahrenheit: ");
	        double fahrenheit = input.nextDouble();

	        double  celsius =(( 5 *(fahrenheit - 32.0)) / 9.0);
	        System.out.println(fahrenheit + "  Fahrenheit is equal to " + celsius + "degree in Celsius");

	}

}
