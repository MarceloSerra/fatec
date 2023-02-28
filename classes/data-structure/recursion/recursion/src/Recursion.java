import java.util.List;

public class Recursion {
    public static Integer recursiveMultiplierSum(Integer value, Integer multiplier) {
        return multiplier == 1 ? value : value + recursiveMultiplierSum(value, multiplier - 1);
    }
    public static Integer recursiveDivisionModule(Integer value, Integer divisor) {
        return value - divisor < 0 ? value : recursiveDivisionModule(value - divisor, divisor);
    }

    public static Integer recursiveArrayEvenNumberCounter(Integer[] arr, Integer length, Integer evenCount){
        if(arr[length] % 2 == 0) evenCount++;
        return length == 1 ? evenCount : recursiveArrayEvenNumberCounter(arr, length - 1, evenCount);
    }

    public static Integer recursiveFactorial (Integer value) {
        // Conditional: Arg value equals 1
        // Return must be the value multiplied by the function value minus 1 arg
        return value == 1 ? value : value * recursiveFactorial(value - 1);
    }

    public static Integer recursiveArrayNegativeNumberCounter(Integer[] arr, Integer length, Integer negativeCount){
        // Conditional: Array length equals 1
        // Return must be calling the function with the array, array's length minus 1 and the negativeCounter
        if(arr[length] < 0) negativeCount++;
        return length == 1 ? negativeCount : recursiveArrayNegativeNumberCounter(arr, length - 1, negativeCount);
    }

    public static Integer recursiveNumberDigitsCounter(Integer value, Integer counter) {
        // Conditional: Value divided by 10 lesser than 1
        // Return must be calling the function with value divided by 10 and counter plus 1
        return value / 10 < 1 ? counter : recursiveNumberDigitsCounter(value / 10, ++counter);
    }

    public static String recursiveReverseString(String arg, String reversedArg) {
        // Conditional: Arg length value equals 0
        // Return must be calling the function with arg being the string starting from the second position
        // and reverseArg concatenated with the first string position at left side
        return arg.length() == 0 ? reversedArg : recursiveReverseString(arg.substring(1), arg.charAt(0) + reversedArg);
    }

    public static Integer recursiveFibonacci (Integer value) {
        // Bonus
        // Conditional: Arg value lesser than 2
        // Return must be the function with the value minus 1 plus the function with the value minus 2
        return value < 2 ? value : recursiveFibonacci(value - 1) + recursiveFibonacci(value - 2);
    }
}
