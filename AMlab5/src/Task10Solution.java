public class Task10Solution {
    private static int temp = 0;

    public static int reverseNumber(int number) {
        int result = temp * 10 + number % 10;
        if (number > 10) {
            temp = result;
            result = reverseNumber(number/10);
        }
        return result;
    }
}
