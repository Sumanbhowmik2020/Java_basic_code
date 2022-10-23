/* Calculate Power of a Number */
import java.util.Scanner;

class Power
{
    public static void main(String[] args){

        int n,p,result=1;
        System.out.print("Enter No.");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();
        System.out.print("Enter Power.");
        Scanner r2=new Scanner(System.in);
        p=r2.nextInt();

        for(int i=1;i<=p;i++)
        {
                result=n*result;
        }
        System.out.print(result);
    }
}