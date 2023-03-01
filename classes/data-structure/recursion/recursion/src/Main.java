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

        Double recursiveFactorialResult = Recursion.recursiveFactorial(6.0);
        // System.out.println(recursiveFactorialResult);

        Integer[] arr2 = {1, -2, 3, -4, 5, 6, -7, 8, 9, -10, 11, -12};
        Integer recursiveArrayNegativeNumberCounterResult = Recursion.recursiveArrayNegativeNumberCounter(arr2, arr2.length - 1, 0);
        // System.out.println(recursiveArrayNegativeNumberCounterResult);

        Integer recursiveNumberDigitsCounterResult = Recursion.recursiveNumberDigitsCounter(4056, 1);
        // System.out.println(recursiveNumberDigitsCounterResult);

        String recursiveReverseStringResult = Recursion.recursiveReverseString("string", "");
        // System.out.println(recursiveReverseStringResult);

        Integer recursiveSomatoryResult = Recursion.recursiveSomatory(10);
        // System.out.println(recursiveSomatoryResult);

        Integer inputArg = 836363;
        if(inputArg < 10 || inputArg > 999999) throw new Error("Value must be between 10 and 999999");
        Integer recursiveEqualDigitsCounterResult = Recursion.recursiveEqualDigitsCounter(inputArg, 3, 0);
        // System.out.println(recursiveEqualDigitsCounterResult);

        String recursiveDecimalToBinaryConverterResult = Recursion.recursiveDecimalToBinaryConverter(45, "");
        // System.out.println(recursiveDecimalToBinaryConverterResult);

        Double recursiveFractionalSomatoryResult = Recursion.recursiveFractionalSomatory(3.0, 0.0);
        // System.out.println(recursiveFractionalSomatoryResult);

        Integer recursiveFibonacciResult = Recursion.recursiveFibonacci(6);
        // System.out.println(recursiveFibonacciResult);

        Double recursiveFractionalFactorialSomatoryResult = Recursion.recursiveFractionalFactorialSomatory(10.0, 0.0);
        // System.out.println(recursiveFractionalFactorialSomatoryResult);
    }
}