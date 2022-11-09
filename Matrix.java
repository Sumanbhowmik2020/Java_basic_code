/* Matrix Program Using 2D Array */

import java.util.Scanner;

class Matrix
{
    public static void main(String[] args) {

        int a[][]=new int[3][3];
        Scanner r=new Scanner(System.in);
        System.out.print("Enter Array Elements: ");
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                a[i][j]=r.nextInt();
            }
        }
        System.out.print("Matrix : \n");
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
}
