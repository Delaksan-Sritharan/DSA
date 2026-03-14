package LinearSearch;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {3, 7, 2, 9, 5};
        int findVal = 9;

        int result = linearSearch(arr,findVal);

        if (result!= -1){
            System.out.println("Value " + findVal + " is found in the index of " + result);
        }else {
            System.out.println("Value " + findVal + " is not found");
        }




    }
    public static int linearSearch(int [] arr, int findVal){
        for (int i = 0; i < arr.length;i++){
                if (arr[i] == findVal){
                    return i;
                }
        }
        return -1;
    }

}
