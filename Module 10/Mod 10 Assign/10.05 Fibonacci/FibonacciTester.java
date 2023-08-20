import java.util.Scanner;

/**
 * This program outputs the fibonacci values for a range of numbers(0-46) given 
 * an integer input from the user.
 *
 * @author
 * @version 4/13/23
 */
class Fibonacci
{
    public Fibonacci()
    {
    }
 public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }

        return fibonacci(n-1) + fibonacci(n-2);
    }
    
}
public class FibonacciTester
{
    public static void run() {
        System.out.print("Enter the number to calculate for the Fibonacci Value(0-46): ");
        Scanner in = new Scanner(System.in);
        String fiboString = in.next();
        if (fiboString.equals("q")) {
            System.exit(0);
        } else {
            int fibo = Integer.parseInt(fiboString);
            if(fibo>46){
         System.out.println("Number out of bounds");
            run();
            }
            fibo = Fibonacci.fibonacci(fibo);
            System.out.println("Fibonacci Value: "+ fibo);
            run();
        }
    }
    public static void main(String[]args){
        
        System.out.println("Calculate the Fibonacci Value of a number(0-46)");
        System.out.println("Enter \"q\" at any time to quit");
        System.out.println();
        run();
        
    }
}
