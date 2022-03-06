package assignment_week3;
import java.util.Scanner;
public class powerOfTwo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number");
		int a = scan.nextInt();
		int save = a;
		while(a%2==0) {
			a = a/2;
		}
		if(a==1) {
			System.out.println(save+" is power of 2");
		}
		else {
			System.out.println(save+" is not power of 2");
		}
	}

}
