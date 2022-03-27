package assigment;

import java.util.*;
public class FindMiddleElementInArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array size");
		int s = sc.nextInt();
		int Temp = s;
		int[] Number = new int[s];
		System.out.println("Enter numbers");
		for(int i=0; i<s; i++) {
			Number[i] = sc.nextInt();
		}
		s = s/2;
		if(Temp%2==0) {
			System.out.print(Number[s-1]+ " and ");
		}
		System.out.print(Number[s]);
		
	}
}
