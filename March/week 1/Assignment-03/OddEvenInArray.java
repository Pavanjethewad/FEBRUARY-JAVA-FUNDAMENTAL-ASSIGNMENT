package assigment;

import java.util.Scanner;

public class OddEvenInArray {
	public static void main(String[] args) {
		int evenCount = 0;
		int	oddCount = 0;
		int  i;
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		System.out.println("Enter numbers");
		for (i = 0; i < 10; i++) {
			arr[i] = sc.nextInt();
		}
		for (i = 0; i < 10; i++) {
			if (arr[i] % 2 == 0) {
				evenCount++;
			} 
			else {
				oddCount++;
			}
		}
		System.out.println("Even : " + evenCount);
		System.out.println("Odd : " + oddCount);
	}

}
