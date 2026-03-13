package Arrays;

public class Array {
    public static void main(String[] args) {
        int array[] = {7, 12, 9, 4, 11};
        int minVal = array[0];
        for (int i = 0; i < array.length -1;i++){
            if (array[i] < minVal){
                minVal = array[i];
            }
        }
        System.out.println("Min value is " + minVal);
    }
}
