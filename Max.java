/* Maximum number b/w two Numbers */

import java.util.Scanner;

class Max{

	public static void main(String[] args) {
		
		int a,b;
		System.out.print("Enter two Numbers ");
		Scanner r=new Scanner(System.in);
		a=r.nextInt();
		b=r.nextInt();

		if(a>b)
		{
			System.out.print(a);
		}
		else
		{
			System.out.print(b);
		}
	}
}