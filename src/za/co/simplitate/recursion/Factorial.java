package za.co.simplitate.recursion;

import static za.co.simplitate.util.SortUtil.*;

public class Factorial {

    public static void main(String[] args) {

        printEmptyLine();
        printInt(iterativeFactorial(3));
        printSeparators();
        printInt(recursiveFactorial(3));

    }

    /*
    '!' means factorial
     1! = 1 * 0! = 1
     2! = 2 * 1 = 2 * 1!
     3! = 3 * 2 * 1 = 3 * 2!
     4! = 4 * 3 * 2 * 1 = 4 * 3!
     etc etc
    
     therefore the formula for calculating factorial is 
     n! = n * (n -1)!
     */

    public static int recursiveFactorial(int num) {
        if(num == 0) // breaking condition || base condition
            return 1;

        return num * recursiveFactorial(num -1);
    }

    public static int iterativeFactorial(int num) {
        if(num == 0)
            return 1;

        int factorial = 1;
        for(int i = 1; i <= num; i++)
            factorial *= i;

        return factorial;
    }
}
