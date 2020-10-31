package task2;

public class VictorianChair implements Chair {
    private int age;

    public int getAge() {
        return age;
    }

    public VictorianChair(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "VictorianChair{" +
                "age=" + age +
                '}';
    }

    @Override
    public void sit() {
        System.out.println("Sitting on Victorian Chair, which age is " + getAge());
    }
}
