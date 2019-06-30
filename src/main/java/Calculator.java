public class Calculator {

    public static int add(String numbers) {
        if (numbers.length() == 1) {
            int number = toInt(numbers);
            return number;
        } else if (numbers.length() > 1) {
            String[] nums = numbers.split(",");
            return (toInt(nums[0]) + toInt(nums[1]));
        } else {
            return 0;
        }
    }

    public static int toInt(String string) {
        return Integer.parseInt(string);
    }
}
