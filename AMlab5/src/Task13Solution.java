import java.util.Scanner;

public class Task13Solution {
    public static void printOddIndex() {
        Scanner keyboard = new Scanner(System.in);
        int number = keyboard.nextInt();
        if (number == 0) {
            return;
        }
        System.out.println(number);
        keyboard.nextInt();
        printOddIndex();
    }
}
