package ru.mirea.lab1;
import java.lang.System;

public class Dog {
    private String dogName;
    private Integer dogAge;

    public Dog(String dogName, Integer dogAge) {
        setName(dogName);
        setAge(dogAge);
    }

    public void setName(String dogName) {
        this.dogName = dogName;
    }
    public void setAge(Integer dogAge) {
        this.dogAge = dogAge;
    }

    public String getDogName() {
        return dogName;
    }
    public Integer getDogAge() {
        return dogAge;
    }

    public Integer intoHumanAge () {
        return this.dogAge * 7;
    }

    public String toString() {
        return "Dog's name: " + this.dogName + "\nDog's age: " + this.dogAge
                + "\nDog's age in human years: " + this.intoHumanAge() + "\n";
    }
}
