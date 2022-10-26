/*  toString() asList() deepToString() */

import java.util.Arrays;

class Arraymethod
{
    public static void main(String[] args){

        String a[]={"Learn","Codeing","Keyboard","Education"};

        System.out.println("toString()"+Arrays.toString(a));
        System.out.println("asList()"+Arrays.asList(a));

        int arr[][]={{10,20},{30,40}};
        System.out.println("deeprToString()"+Arrays.deepToString(arr));
    }
}