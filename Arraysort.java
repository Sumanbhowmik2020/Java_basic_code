/* Sort array elements in ascending order */


import java.util.Scanner;

class Arraysort
{
    public static void main(String[] args) {

        int a[]=new int[5];
        Scanner r = new Scanner(System.in);
        System.out.println("Enter Elements in array");
        for(int i=0;i<a.length;i++)
        {
            a[i]=r.nextInt();
        }
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.print("After Sorting:");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}