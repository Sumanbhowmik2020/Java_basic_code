/* Calculate average marks of five subjects*/
import java.util.Scanner;

class Average 
{
    public static void main(String[] args){

        int a,b,c,d,e;
        System.out.print("Enter marks of five subjects");
        Scanner r=new Scanner(System.in);
        a=r.nextInt();
        b=r.nextInt();
        c=r.nextInt();
        d=r.nextInt();
        e=r.nextInt();

        int sum=a+b+c+d+e;
        System.out.println("Total marks"+ sum);

        double avg=sum/5.0;

        System.out.print("Average Marks"+ avg);

    }
}