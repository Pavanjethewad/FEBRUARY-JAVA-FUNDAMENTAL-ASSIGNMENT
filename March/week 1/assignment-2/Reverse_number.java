package march_week_1;
import java.util.Scanner;

public class Reverse_number {

	public static void reverse(int n)
	{
		while(n>0)
		{
			int r = n%10;
			System.out.print(r);
			n = n/10;
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		reverse(n);
	}
}
