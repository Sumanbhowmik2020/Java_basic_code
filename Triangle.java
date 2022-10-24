/* Area of Triangle Program */

import java.util.Scanner;
import java.lang.Math;

class Triangle
{
    public static void main (String[] args) {
        int a,b,c,sp;
        double area;
        System.out.print("Enter value for sides of Triangle");
        Scanner r=new Scanner(System.in);
        a=r.nextInt();
        b=r.nextInt();
        c=r.nextInt();

        sp=(a+b+c)/2;
        area=Math.sqrt(sp*(sp-a)*(sp-b)*(sp-c));

        System.out.println("Area of Triangle: " + area);
    }
}