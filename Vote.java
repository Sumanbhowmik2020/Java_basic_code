/* Eligible for Vote or Not */
import java.util.Scanner;
class Vote
{
    public static void main(String[] args){

        int age;
        System.out.print("Enter Your Age");
        Scanner r=new Scanner(System.in);
        age = r.nextInt();

        if(age>=18)
        {
            System.out.print("Eligible For Votes");
        }
        else
        {
            System.out.print("Not Eligible For Votes");
        }

    }
}