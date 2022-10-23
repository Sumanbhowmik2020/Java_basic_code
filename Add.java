/* Sum of Two Numbers */

import java.util.Scanner;

class Add
{
	public static void main(String[] args) {
		
		int a,b,sum;
		System.out.println("Enter two Numbers");
		Scanner r=new Scanner(System.in);
		a=r.nextInt();
		b=r.nextInt();

		sum=a+b;

		System.out.println("ADDITION " + sum);
	}
}