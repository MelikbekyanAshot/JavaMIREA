package ru.mirea.lab1;
import java.lang.System;

public class practice1 {
    public static void main(String[] args) {
        Dog myDog = new Dog("Jessie", 2);
        System.out.println("Test of Dog class");
        System.out.println("Dog's name: " + myDog.getDogName());
        System.out.println("Dog's age: " + myDog.getDogAge() + "\n");

        Ball myBall = new Ball("football", "Nike");
        System.out.println("Test of Ball class");
        System.out.println("Ball's type: " + myBall.getBallType());
        System.out.println("Ball's manufacturer: " + myBall.getBallManufacturer() + "\n");

        Book myBook = new Book("R.D. Bradbury", "A Sound of Thunder", 1957);
        System.out.println("Test of Book class");
        System.out.println("Author: " + myBook.getAuthor());
        System.out.println("Book's name: " + myBook.getBookName());
        System.out.println("Publication year: " + myBook.getPublicationYear() + "\n");
    }
}
