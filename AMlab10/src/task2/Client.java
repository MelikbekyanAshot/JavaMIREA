package task2;

public class Client implements Chair{
    Chair chair;

    public void setChair(Chair chair) {
        this.chair = chair;
    }

    public void sit() {
        System.out.println("Sit on chair");
    }
}
