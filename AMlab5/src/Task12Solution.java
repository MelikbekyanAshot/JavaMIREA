import java.util.Scanner;

public class Task12Solution {
    public static void isOdd() {
        Scanner keyboard = new Scanner(System.in);
        int number =  keyboard.nextInt();
        if (number % 2 == 1) {
            System.out.println(number);
        } else if (number == 0) {
            return;
        }
        isOdd();
    }
}
