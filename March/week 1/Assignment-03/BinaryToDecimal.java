package assigment;

import java.util.*;

public class BinaryToDecimal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter binary number");
		int n = sc.nextInt();
		int save = n;
		int decimalNumber = 0;
		int power = 0;
		while(n>0) {
			int r = n%10; 
			n = n/10;     
			if(r==0) {    
				power++;
			}
			else if(r==1) { 
				decimalNumber = (int) (decimalNumber + Math.pow(2, power));
				power++;
			}
		}
		System.out.println("Binary number " + save+" = "+ "DecimalNumber " +decimalNumber);
	}
}
