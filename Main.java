public class Main {

/**
     *  This is the main method of the program. We establish that our int 'n' is 10
     *  so that way we can get the 10th Fibonacci term. Once we run through our
     *  recursive method the main method will output a string along with the all first 10
     *  terms of the Fib sequence.
     * @param args outputs a string message along with our 'fib' method
     * @author Jade Boone
     */
    public static void main(String[] args) {
        int n = 10;
        System.out.print("The " + n + "th term of the Fibonacci sequence is: ");

        for(int i = 0; i < n; i++){
            System.out.print(fib(i) + " ");
        }
    }

/**
     * This here is the recursive method. It takes our established 'n' and repeats the process
     * until 10 is reached. Once arriving at 10 it will output the Fibonacci sequence
     * until the 10th term.
     * @param n the number involved in the recursive method. In this case
     *          the number is 10 as determined in the main method.
     * @return n is returned when it is less than or equal to
     *          else the Fibonacci sequence is returned instead.
     */
    public static int fib(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }
}
