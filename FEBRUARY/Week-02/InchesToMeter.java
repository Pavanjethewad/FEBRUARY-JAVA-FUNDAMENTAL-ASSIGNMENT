package assignment_week2;
import java.util.Scanner;
public class InchesToMeter {

	public static void main(String[] args) {
		double inch;
		double meter;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter value in Inches;");
		
		inch=input.nextDouble();
		meter= inch * 0.0254;
		System.out.print(meter);
		
		
		
		
		
	}
	

}
