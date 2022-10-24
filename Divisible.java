/* W A P to check Divisibility of 5 */

import java.util.Scanner;

class Divisible
{
    public static void main(String[] args){

        int n;
        System.out.print("Enter any Number ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        if(n%5==0)
        {
            System.out.println( n + " divisible by 5 ");
        }
        else
        {
            System.out.println( n + " not divisible by 5 ");
        }    
    }
}