/* Calculator Program in Java*/

import java.util.Scanner;

class Calculator
{
    public static void main(String[] args){

        int n1,n2,ch,cal;
        System.out.print("Enter two Numbers");
        Scanner r=new Scanner(System.in);
        n1=r.nextInt();
        n2=r.nextInt();
        System.out.print(" 'Select Operation' 'ADDITION for 1''SUBTRACTION for 2''MULTIPLICATION for 3'' DIVISION for 4''REMAINDER for 5' ");
        ch=r.nextInt();
         if(ch==1)
         {
            cal=n1+n2;
            System.out.print("ADDITION"+cal);
         }
         else if(ch==2)
         {
            cal=n1-n2;
            System.out.print("SUBTRACTION"+cal);
         }
         else if(ch==3)
         {
            cal=n1*n2;
            System.out.print("MULTIPLICATION"+cal);
         }
         else if(ch==4)
         {
            cal=n1/n2;
            System.out.print("DIVISION"+cal);
         }
         else
         {
            cal=n1%n2;
            System.out.print("REMAINDER"+cal);
         }

    }
}