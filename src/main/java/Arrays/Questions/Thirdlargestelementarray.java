package Arrays.Questions;

import Arrays.Array;

import java.util.Arrays;

public class Thirdlargestelementarray {

    static int getThirdLargestElement(int []arr){
        int n = arr.length;

        Arrays.sort(arr);

        for (int i = n-3;i>=0;i--){
            if (arr[i]!=arr[n-1]){
                return arr[i];
            }
        }
        return -1;
    }


    public static void main(String[]args){
        int array [] = {1, 14, 2, 16, 10, 20};
        System.out.println(getThirdLargestElement(array));

    }
}
