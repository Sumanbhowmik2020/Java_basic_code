/* Find Sum of Array Elements */

import java.util.Scanner;

class Arraysum
{
    public static void main(String[] args) {

        int a[]=new int[5];
        int sum=0;
        Scanner r= new Scanner(System.in);
        System.out.println("Enter Array Elements");
        for(int i=0;i<a.length;i++)
        {
            a[i]=r.nextInt();
        }
        System.out.print("Array Elements ");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
            sum=a[i]+sum;
        }
        System.out.println("\n Sum of Array Elements : "+ sum);
    }
}