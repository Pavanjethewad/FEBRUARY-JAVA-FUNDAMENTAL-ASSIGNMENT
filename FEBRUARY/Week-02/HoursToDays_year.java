package assignment_week2;
import java.util.Scanner;
public class HoursToDays_year {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		double hours;
		double day;
		double year;
		
	System.out.print("Enter value in Hours:" );
		hours=input.nextDouble();
		
		day=0.0416667 *hours;
		year=0.000114155*hours;
		
		System.out.print(hours +" Hrs is equal to" + day + "Days & " + year +"Years");
		
	
		
		
		
		
		
		
	}

}
