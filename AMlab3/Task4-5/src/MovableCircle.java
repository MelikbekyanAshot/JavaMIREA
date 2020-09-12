public class MovableCircle implements Movable{
    private final int radius;
    private final MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "x: " + this.center.x + "\ny: " + this.center.y + "\nx speed: " + this.center.xSpeed +
                "\ny speed: " + this.center.ySpeed + "\n";
    }

    @Override
    public void moveUp() {
        this.center.y += this.center.ySpeed;
    }

    @Override
    public void moveDown() {
        this.center.y -= this.center.ySpeed;
    }

    @Override
    public void moveRight() {
        this.center.x += this.center.xSpeed;
    }

    @Override
    public void moveLeft() {
        this.center.x -= this.center.xSpeed;
    }
}
