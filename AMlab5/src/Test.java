import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Test 9 task. Enter amount of zeroes and units:");
        System.out.println(Task9Solution.without2Zero(keyboard.nextInt(), keyboard.nextInt()));
        System.out.println("Test 10 task. Enter number:");
        System.out.println(Task10Solution.reverseNumber(keyboard.nextInt()));
        System.out.println("Test 12 task. ");
        Task12Solution.isOdd();
        System.out.println("Test 13 task. ");
        Task13Solution.printOddIndex();
    }
}
