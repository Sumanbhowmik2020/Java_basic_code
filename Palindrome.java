/* Palindrome Number Program */

import java.util.Scanner;
class Palindrome
{
    public static void main(String[] args){

        int n,c,r,s=0;
        System.out.print("Enter any Number");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        c=n;
        while(n>0)
        {
            r=n%10;
            s=(s*10)+r;
            n=n/10;
        }
        if(c==s)
        {
            System.out.print("Palindrome Number ");
        }
        else
        {
            System.out.print("Not Palindrome Number ");
        }
    }
}