public class TestBall {
    public static void main(String[] args) {
        Ball myBall = new Ball(5, 7);
        System.out.println(myBall);
        myBall.move(111, -111);
        System.out.println(myBall);
    }
}
