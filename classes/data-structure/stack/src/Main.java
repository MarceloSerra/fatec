import java.util.List;

public class Main {
    public static void main(String[] args) {
        CustomDynamicStack<Integer> stack = new CustomDynamicStack<>();

        Runnable stackTest = () -> {
            List<Integer> dataList = List.of(new Integer[]{10, 11, 12, 13, 14, 15});

            for(Integer data:dataList) stack.push(data);

            for(Integer i = stack.size(); i > -1; i--) stack.pop(); // Should throw an error
        };
        stackTest.run();
    }
}