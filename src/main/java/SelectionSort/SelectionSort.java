package SelectionSort;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {64, 34, 25, 5, 22, 11, 90, 12};
        int n = array.length;

        System.out.println("Before sorting:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // Selection Sort Logic
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i; // Assume the first element is the smallest

            for (int j = i + 1; j < n; j++) { // Fix: j starts at i + 1
                if (array[j] < array[minIndex]) {
                    minIndex = j; // Found a new minimum
                }
            }

            // Swap the found minimum element with the first element
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }

        System.out.println("After sorting:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}