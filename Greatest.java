/* Find greatest number among three Numbers */

class Greatest
{
    public static void main(String[] args){
        int a=10,b=20,c=30;

        if(a>b)
        {
            if(a>c)
            {
               System.out.print(a); 
            }
            else
            {
                System.out.print(c);
            }
        }
        else
        {
             if(b>c)
            {
               System.out.print(b); 
            }
            else
            {
                System.out.print(c);
            }
        }
    }
}