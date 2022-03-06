package march_week_1;
import java.util.Scanner;
public class fibonaci_method {

	public static void fibonacii(int count) {
		int  a = 0, b = 1;
		System.out.print(a+" "+b+" ");
		while((count-2)>0) {
			int result = a + b;
			System.out.print(result+" ");
			a = b;
			b = result;
			count--;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter count");
		int count = sc.nextInt();
		fibonacii(count);
	}
}
