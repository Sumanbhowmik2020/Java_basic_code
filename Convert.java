/* Convert character Lower to Upper & vice-versa. */

import java.util.Scanner;

class Convert
{
    public static void main(String[] args){
        char ch,ch2;
        System.out.print("Enter any character to convert ");
        Scanner sc = new Scanner(System.in);
        ch = sc.next().charAt(0);

        if(ch >='A' && ch <='Z')
        {
            ch2=Character.toLowerCase(ch);
            System.out.print("LowerCase " + ch2);
        }
        else
        {
            ch2=Character.toUpperCase(ch);
            System.out.print("UpperCase " + ch2);
        }
    }
}