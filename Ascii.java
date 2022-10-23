/* Print ASCII Value of Character */

import java.util.Scanner;
class Ascii{
	
	public static void main(String[] args) {
			
			char ch;
			System.out.print("Please enter Character ");
			Scanner r=new Scanner(System.in);
			ch=r.next().charAt(0);

			int a=ch;

			System.out.print("ASCII value of "+ ch +" is "+a);

		}	
}