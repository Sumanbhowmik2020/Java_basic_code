/* Right down Mirror Star Pattern */
/*

*****
 ****
  ***
   **
    *

*/
class Rightdownmirrorpattern
{
    public static void main(String[] args) {

        int i,j,k;
        for(i=1;i<=5;i++) //raws
        {
            for(j=1;j<i;j++)
            {
                System.out.print(" ");
            }
            for(k=i;k<=5;k++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}