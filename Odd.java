/* PRINT ODD NUMBERS IN GIVEN RANGE */

import java.util.Scanner;

class Odd{
	public static void main(String[] args) {
		int n;
		System.out.print("Enter No of term ");
		Scanner r=new Scanner(System.in);
		n=r.nextInt();

		System.out.print("Odd Number are " );
		for(int i=1;i<=n;i=i+2)
		{
			System.out.print( i +" ");
		}
	}
}