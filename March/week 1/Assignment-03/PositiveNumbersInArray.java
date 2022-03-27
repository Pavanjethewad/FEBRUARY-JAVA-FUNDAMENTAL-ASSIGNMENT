package assigment;

import java.util.Scanner;

public class PositiveNumbersInArray {
	public static void main(String[] args) {
		int[] n = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers");
		for (int i = 0; i < 10; i++) {
			n[i] = sc.nextInt();
		}
		
		for (int i = 0; i < 10; i++) {
			if (n[i] > 0) {
				System.out.println(n[i]+" Are positive numbers");
			}
		}
	}
}
