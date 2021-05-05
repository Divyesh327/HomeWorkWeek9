package homeworkweek9;

import java.util.Arrays;

public class Program3
{
    public static void main(String[] args)
    {
        int[] array = {1002, 1112, 1122, 1325, 8585, 1541, 1005, 7895, 4745, 9698};
        System.out.println("Original Array : " + Arrays.toString(array));
        for (int i = 0; i < array.length / 2; i++)
        {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        System.out.println("Reverse Array : " + Arrays.toString(array));
    }

}



