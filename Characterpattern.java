/* Right Alphabetic triangle pattern in java */


/*

A
AB
ABC
ABCD
ABCDE

*/

class Characterpattern
{
    public static void main(String[] args){

        char i,j;
        for(i='A';i<='E';i++)
        {
            for(j='A';j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.print("\n");
        }
    }
}