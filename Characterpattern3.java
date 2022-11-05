/* Right Alphabetic triangle pattern(type 3) in java */


/*

A
BC
DEF
GHIJ
KLMNO

*/

class Characterpattern3
{
    public static void main(String[] args){

        char i,j,count='A';
        for(i='A';i<='E';i++)
        {
            for(j='A';j<=i;j++)
            {
                
                System.out.print(count);
                count++;
            }
            System.out.print("\n");
        }
    }
}