package src.Problem_Of_The_Day.Array;

import java.util.Arrays;

public class Smaller_elements_from_right_side {

    public static int[] constructLowerArray(int[] arr, int n) {
        int count = 0;
        int[] result_arr = new int[n];

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    count++;
                }
            }

            result_arr[i] = count;
            count = 0;
        }

        return result_arr;
    }

    public static void main(String[] args) {
        int[] a = {12, 1, 2, 3, 0, 11, 4};

        int[] result_array = constructLowerArray(a, a.length);
        System.out.println("Smaller elements from right side of array :: " + Arrays.toString(result_array));
    }
}


//Output:
//--------
//Smaller elements from right side of array :: [6, 1, 1, 1, 0, 1, 0]

//Explanation:
//-------------
//There are 6 elements right after 12. There are 1 element right after 1. And so on.
