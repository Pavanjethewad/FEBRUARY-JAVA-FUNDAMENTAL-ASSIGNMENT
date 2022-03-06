package march_week_1;
import java.util.Scanner;
public class Add_Number_method {

	public static void add(int a, int b) {
		int result = a + b;
		System.out.println(a+" + "+b+" = "+ result);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = sc.nextInt();
		System.out.println("Enter second number");
		int b = sc.nextInt();
		add(a,b);
	}
}
