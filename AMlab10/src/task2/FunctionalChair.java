package task2;

import java.util.Scanner;

public class FunctionalChair implements Chair{
    public int sum(int a, int b) {
        return a + b;
    }

    @Override
    public String toString() {
        return "Functional Chair";
    }

    @Override
    public void sit() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter two number to get their sum: ");
        System.out.println("Sitting on Functional Chair with sum " + sum(keyboard.nextInt(), keyboard.nextInt()));
    }
}
