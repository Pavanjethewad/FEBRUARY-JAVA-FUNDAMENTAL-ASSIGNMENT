package assignment_week2;
import java.util.Scanner;

public class SumOfDigitInNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n; 
		int r=0;
		int sum=0;
		System.out.print("Enter the number:");
		n=sc.nextInt();
		
		while(n>0)
		{
			r=n%10;
			sum=sum+n%10;
			n=n/10;
		
		}

		
		System.out.println("the sum is" + sum);
	}

}
