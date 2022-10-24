/* Area of Circle Program */

import java.util.Scanner;

class Area
{
    public static void main(String[] args){

        final double PI=3.14,area;
        int r;
        System.out.println("Enter radious of circle");
        Scanner sc=new Scanner(System.in);
        r=sc.nextInt();

        area =PI*r*r;
        System.out.println("Area of Circle is: "+area);
    }
}