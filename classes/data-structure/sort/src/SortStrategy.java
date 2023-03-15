import java.util.List;


public class SortStrategy {

    private static boolean currentIsGreaterThanNext(Integer current, Integer next){
        return current > next;
    }
    private static void swap(Integer[] arr, Integer current, Integer next){
        Integer temp = arr[current];
        arr[current] = arr[next];
        arr[next] = temp;
    };

    static Integer[] bubble(Integer[] arr){
        Integer[] sortedArr = arr;

        while(true) {
            boolean hasSwapped = false;

            for(int i = 0; i < sortedArr.length - 1; i++){
                if(currentIsGreaterThanNext(sortedArr[i], sortedArr[i + 1])){
                    swap(sortedArr, i, i + 1);
                    hasSwapped = true;
                }
            }
            if(!hasSwapped) break;
        }

        return sortedArr;
    }

    public static Integer[] mergeAll(
            Integer[] arr, Integer[] leftArr, Integer[] rightArr, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k++] = leftArr[i++];
            }
            else {
                arr[k++] = rightArr[j++];
            }
        }
        while (i < left) {
            arr[k++] = leftArr[i++];
        }
        while (j < right) {
            arr[k++] = rightArr[j++];
        }
        return arr;
    }

    public static Integer[] merge(Integer[] arr, Integer length) {
        if (length < 2) {
            return arr;
        }
        Integer middle = length / 2;
        Integer[] leftArr = new Integer[middle];
        Integer[] rightArr = new Integer[length - middle];

        for (int i = 0; i < middle; i++) leftArr[i] = arr[i];
        for (int i = middle; i < length; i++) rightArr[i - middle] = arr[i];

        merge(leftArr, middle);
        merge(rightArr, length - middle);

       return mergeAll(arr, leftArr, rightArr, middle, length - middle);
    }
}
