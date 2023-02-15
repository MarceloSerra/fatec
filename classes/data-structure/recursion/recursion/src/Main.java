import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Integer recursiveSumMultiplierResult = Recursion.recursiveMultiplierSum(10, 5);
        System.out.println(recursiveSumMultiplierResult);

        Integer recursiveDivisionModuleResult = Recursion.recursiveDivisionModule(11, 5);
        System.out.println(recursiveDivisionModuleResult);

        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        Integer recursiveArrayEvenNumberCounter = Recursion.recursiveArrayEvenNumberCounter(arr, arr.length - 1, 0);
        System.out.println(recursiveArrayEvenNumberCounter);
    }
}