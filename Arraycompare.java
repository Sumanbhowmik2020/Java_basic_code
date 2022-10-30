/* Compare Arrays */


import java.util.Arrays;

class Arraycompare
{
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        if(Arrays.equals(arr1, arr2))
        {
            System.out.print("Both arrays are equal");
        }
        else
        {
            System.out.print("Arrays are not equal");
        }
    }
}