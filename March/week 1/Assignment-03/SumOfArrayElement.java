package assigment;
import java.util.*;
public class SumOfArrayElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum=0;
		System.out.println("Enter numbers ");
		int[] elements = new int[5];
		for(int i=0; i<5; i++) {
			elements[i] = sc.nextInt();
			sum = sum + elements[i];
		}
		System.out.println("Sum is = "+sum);
	}
}
