/* Swap of Two Numbers without Using Third Variable */

import java.util.Scanner;

class Swaptwo
{
    public static void main(String[] args){

        int a,b;
        System.out.print("Enter any two numbers");
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("Before Swapping " + a + " "+b);

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.print("After Swapping " + a + " "+b);
    }
}