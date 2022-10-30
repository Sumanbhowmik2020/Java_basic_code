/* Insert item in Array */

import java.util.Scanner;

class Arrayinsert
{
    public static void main(String[] args) {

        int size,loc,item,i;
        Scanner r=new Scanner(System.in);
        System.out.print("Enter Array Size: ");
        size=r.nextInt();

        int arr[]=new int[size+1];
        System.out.print("Enter Array Elements: ");
        for(i=0;i<size;i++)
        {
            arr[i]=r.nextInt();
        }
        System.out.print("Enter Array location: ");
        loc=r.nextInt();
        System.out.print("Enter new item to be inserted: ");
        item=r.nextInt();

        for(i=size;i>loc;i--)
        {
            arr[i]=arr[i-1];
        }
        arr[loc]=item;
        size++;
        System.out.print("Array after Insertion: ");
        for(i=0;i<size;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}