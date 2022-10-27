/* Find average of array Elements */

import java.util.Scanner;

class Arrayaverage
{
    public static void main(String[] args) {

        int a[]=new int[5];
        int sum=0; double avg;
        Scanner r = new Scanner(System.in);
        System.out.print(" Enter elements in array ");
        for(int i=0; i<a.length;i++)
        {
            a[i]=r.nextInt();
        }
        System.out.print("Array Elements");;
        for(int i=0; i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        for(int i=0; i<a.length;i++)
        {
            sum=a[i]+sum;
        }
        avg=sum/5;
        System.out.print("\nAddition: "+sum+"\nAverage: "+avg);
    }
}