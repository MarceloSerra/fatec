import java.util.List;

public class Recursion {
    public static int recursiveMultiplierSum(Integer value, Integer multiplier) {
        return multiplier == 1 ? value : value + recursiveMultiplierSum(value, multiplier - 1);
    }
    public static int recursiveDivisionModule(Integer value, Integer divisor) {
        return value - divisor < 0 ? value : recursiveDivisionModule(value - divisor, divisor);
    }

    public static int recursiveArrayEvenNumberCounter(Integer[] arr, Integer length, Integer evenCount){
        if(arr[length] % 2 == 0) evenCount++;
        return length == 1 ? evenCount : recursiveArrayEvenNumberCounter(arr, length - 1, evenCount);
    }
}
