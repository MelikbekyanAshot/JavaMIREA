public class Test {
    public static void main(String[] args) {
        // Test Movable interface
        System.out.println("Test interface Movable\n" + "In first test we are going to move point down and left");
        Movable point = new MovablePoint(0, 5, 1, 2);
        System.out.println("Before move");
        System.out.println(point);
        point.moveDown();
        point.moveLeft();
        System.out.println("After move");
        System.out.println(point);

        System.out.println("In second test we are going to move circle up and right");
        Movable circle = new MovableCircle(0, 0, 7, 9, 5);
        System.out.println("Before move");
        System.out.println(circle);
        circle.moveUp();
        circle.moveRight();
        System.out.println(circle);

        System.out.println("In third test we are going to move rectangle two times to up");
        Movable rectangle = new MovableRectangle(0, 2, 2, 0, 4, 4);
        System.out.println("Before move");
        System.out.println(rectangle);
        rectangle.moveUp();
        rectangle.moveUp();
        System.out.println("Before move");
        System.out.println(rectangle);
    }
}
