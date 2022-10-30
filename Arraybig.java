/* Find Biggest Element in Array */



import java.util.Scanner;

class Arraybig
{
    public static void main(String[] args) {

        int a[]=new int[5];
        int max;
        Scanner r = new Scanner(System.in);
        System.out.print("Enter array elements : ");
        for(int i=0;i<a.length;i++)
        {
            a[i] = r.nextInt();
        }
        max = a[0]; 
        for(int i=1;i<a.length;i++)
        {
            if(a[i]>max)
            {
                max = a[i];
            }
        }
        System.out.print("Maximum Element : "+max);
    }
}