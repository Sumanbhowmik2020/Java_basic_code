/* Sort() Equals() copyOf() */

import java.util.Scanner;
import java.util.Arrays;


class Arraymethod2
{
    public static void main(String[] args) {

        int a[]=new int[5];
        int b[]=new int[5];
        Scanner r = new Scanner(System.in);
        System.out.print("Enter Data in Array : ");
        for(int i=0;i<a.length;i++)
        {
            a[i] = r.nextInt();
        }
        System.out.print("Enter Data in 2nd Array : ");
        for(int i=0;i<b.length;i++)
        {
            b[i] = r.nextInt();
        }
        Arrays.sort(a);
        System.out.print("\nAfter sorting (a) array : ");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i] + " ");
        }
        boolean x=Arrays.equals(a,b);
        System.out.print("\ntwo array are equal? "+x);
        int c[]=Arrays.copyOf(a,5);
        System.out.print("\nCopy array of (a) array :");
        for(int i=0;i<c.length;i++)
        {
            System.out.print(c[i] + " ");
        }

    }
}