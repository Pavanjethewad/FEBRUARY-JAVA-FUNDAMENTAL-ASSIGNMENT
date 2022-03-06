
package assignments;
public class PrimeNumber_input {

	public static void main(String[] args) {
	
		int num =7;
		int count=0;
		
		if(num>1)
		{
			for(int i=0;i<=num;i++) 
			{
				if(num%i==0)
					count++;
			}
				if(count==2)
				{
					System.out.print("prime");
				}
		}else
		{
			System.out.println("Not prime");
		}
	}

}
