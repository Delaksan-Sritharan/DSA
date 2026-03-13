package Fibonacci;

public class ForLoop {
    public static void main(String[] args) {
        int prev2 = 0;
        int prev1 = 1;

        System.out.println(prev2);
        System.out.println(prev1);

        for (int i = 0; i < 18; i++){
            int newFibo = prev2 + prev1;
            System.out.println(newFibo);
            prev2 = prev1;
            prev1 = newFibo;
        }

    }

}
