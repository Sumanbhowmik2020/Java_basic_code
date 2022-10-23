/* PRINT EVEN NUMBERS IN GIVEN RANGE */

import java.util.Scanner;

class Even{
	public static void main(String[] args) {
		int n;
		System.out.print("Enter No of term ");
		Scanner r=new Scanner(System.in);
		n=r.nextInt();

		System.out.print("Even Number are " );
		for(int i=0;i<=n;i=i+2)
		{
			System.out.print( i +" ");
		}
	}
}