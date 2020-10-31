package task2;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Chair chair;
        AbstractChairFactory abstractChairFactory = new ChairFactory();
        Scanner keyboard = new Scanner(System.in);

        System.out.println("***Magic Chair Creating***");
        chair = abstractChairFactory.createMagicChair();
        System.out.println(chair);
        chair.sit();

        System.out.println("\n***Victorian Chair Creating***");
        System.out.print("Enter age of Victorian Chair: ");
        chair = abstractChairFactory.createVictorianChair(keyboard.nextInt());
        System.out.println(chair);
        chair.sit();

        System.out.println("\n***Functional Chair***");
        chair = abstractChairFactory.createFunctionalChair();
        System.out.println(chair);
        System.out.println();
        chair.sit();

    }
}
