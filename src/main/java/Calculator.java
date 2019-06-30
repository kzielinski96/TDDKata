import java.util.ArrayList;
import java.util.List;

public class Calculator {

    public static int add(String numbers) {
        if (numbers.length() > 0) {
            return splitString(numbers);
        } else {
            return 0;
        }
    }

    public static int splitString(String string) {
        String[] strings = string.split(",");
        List<Integer> ints = new ArrayList<Integer>();
        for (String num : strings) {
            int i = toInt(num);
            ints.add(i);
        }
        return sumList(ints);
    }

    public static int toInt(String string) {
        return Integer.parseInt(string);
    }

    public static int sumList(List<Integer> integers) {
        int sum = 0;
        for (int i : integers) {
            sum += i;
        }
        return sum;
    }
}
