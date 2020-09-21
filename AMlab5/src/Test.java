import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Test 9 task. Enter amount of zeroes and units:");
        Task9Solution.without2Zero(keyboard.nextInt() ,keyboard.nextInt());
        System.out.println("Test 10 task. Enter number:");
        Task10Solution.reverseNumber(keyboard.nextInt());
        //Task11Solution
        System.out.println("Test 12 task. ");
        Task12Solution.isOdd();
        Task13Solution.printOddIndex();
    }
}
