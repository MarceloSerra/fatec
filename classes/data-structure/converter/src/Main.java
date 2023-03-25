import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        String MAXIMUM_INPUT_ALLOWED_ERROR_MESSAGE = "Maximum input allowed: 1000";

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        Integer data = Integer.parseInt(bufferedReader.readLine()); // Input: 45

        if(data > 1000) throw new Error(MAXIMUM_INPUT_ALLOWED_ERROR_MESSAGE);

        CustomConverter converter = new CustomConverter();
        String result = converter.decimalToBinary(data);
        System.out.println(result); // Output: 101101
    }
}