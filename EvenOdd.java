/* PRINT SUM OF ODD OR EVEN IN GIVEN RANGE */

import java.util.Scanner; 

class EvenOdd{
	
	public static void main(String[] args) {
		
		int n,i,sum=0;
		System.out.print("Enter Range ");
		Scanner r=new Scanner(System.in);
		n=r.nextInt();

		if(n%2==0)
		{
			for(i=0;i<=n;i=i+2)
			{
				sum=sum+i;
			}
			System.out.print("Sum of Even Number "+ sum);
		}
		else
		{
			for(i=1;i<=n;i=i+2)
			{
				sum=sum+i;
			}
			System.out.print("Sum of Odd Number "+ sum);
		}
	}
}