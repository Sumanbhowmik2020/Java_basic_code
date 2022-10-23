/* PRINT CHARACTER IN JAVA */

import java.util.Scanner;
class CharPrint{
	
	public static void main(String[] args) {
			
			char ch;
			System.out.print("Please enter Character ");
			Scanner r=new Scanner(System.in);
			ch=r.next().charAt(0);
			System.out.print(ch);

		}	
}