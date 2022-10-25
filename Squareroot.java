/* Find Square root of a Number */

import java.util.Scanner;

class Squareroot
{
    public static void main(String[] args){
        int n;
        System.out.print("Enter any Number");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        double m=Math.sqrt(n);
        System.out.println("The square root of "+n+" is "+m);
        
    }
}

