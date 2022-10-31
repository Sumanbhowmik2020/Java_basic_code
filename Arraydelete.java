/* delete item in Array */


import java.util.Scanner;

class Arraydelete
{
    public static void main(String[] args) {

        int size,loc,i;
        Scanner r=new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        size=r.nextInt();

        int arr[]=new int[size];
        System.out.print("Enter the elements of the array : ");
        for(i=0;i<size;i++)
        {
            arr[i]=r.nextInt();
        }
        System.out.print("Enter Array location : ");
        loc=r.nextInt();

        for(i=loc;i<size-1;i++)
        {
            arr[i]=arr[i+1];
        }
        size--;
        System.out.print("Array after deleting : ");
        for(i=0;i<size;i++)
        {
            System.out.print(arr[i] + " ");
        }
        
    }
}