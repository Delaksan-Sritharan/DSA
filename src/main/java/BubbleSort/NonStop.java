package BubbleSort;

public class NonStop {
    public static void main(String[] args) {
        int [] array = {7, 3, 9, 12, 11};
        int n = array.length;

        for (int i = 0; i< n-1; i++){
            boolean swapped = false;
            for (int j=0;j< n-i-1;j++){
                if (array[j]> array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
            if (!swapped){
                break;
            }
        }

        System.out.print("Sorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
