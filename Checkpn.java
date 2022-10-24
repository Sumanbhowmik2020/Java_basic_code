/* Check number is Positive or Negative */

import java.util.Scanner;

class Checkpn
{
    public static void main (String[] args){

        int n;
        System.out.print("Enter any Number");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        if (n < 0)
        {
            System.out.println("Negative Number");
        } 
        else if(n>0)
        {
            System.out.println("Positive Number");
        }
        else
        {
            System.out.println("Niether Positive nor Negative");
        }

    }
}