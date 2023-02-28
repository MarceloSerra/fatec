import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Integer recursiveSumMultiplierResult = Recursion.recursiveMultiplierSum(10, 5);
        // System.out.println(recursiveSumMultiplierResult);

        Integer recursiveDivisionModuleResult = Recursion.recursiveDivisionModule(11, 5);
        // System.out.println(recursiveDivisionModuleResult);

        Integer[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        Integer recursiveArrayEvenNumberCounterResult = Recursion.recursiveArrayEvenNumberCounter(arr1, arr1.length - 1, 0);
        // System.out.println(recursiveArrayEvenNumberCounterResult);

        Integer recursiveFactorialResult = Recursion.recursiveFactorial(6);
        // System.out.println(recursiveFactorialResult);

        Integer[] arr2 = {1, -2, 3, -4, 5, 6, -7, 8, 9, -10, 11, -12};
        Integer recursiveArrayNegativeNumberCounterResult = Recursion.recursiveArrayNegativeNumberCounter(arr2, arr2.length - 1, 0);
        // System.out.println(recursiveArrayNegativeNumberCounterResult);

        Integer recursiveNumberDigitsCounterResult = Recursion.recursiveNumberDigitsCounter(4056, 1);
        // System.out.println(recursiveNumberDigitsCounterResult);

        String recursiveReverseStringResult = Recursion.recursiveReverseString("string", "");
        // System.out.println(recursiveReverseStringResult);
    }
}