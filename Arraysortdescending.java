/* Sort array elements in descending order */

import java.util.Scanner;

class Arraysortdescending
{
    public static void main(String[] args) {

        int a[]=new int[5];
        Scanner r = new Scanner(System.in);
        System.out.print("Enter value in Array : ");
        for(int i=0; i<a.length; i++)
        {
            a[i]=r.nextInt();
        }
        for(int i=0; i<a.length; i++)
        {
            for(int j=i+1; j<a.length; j++)
            {
                if(a[i]< a[j])
                {
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.print("Array in Descending Order : ");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }

    }
}