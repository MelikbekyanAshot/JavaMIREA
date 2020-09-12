public class MovableRectangle implements Movable {
    private final MovablePoint topLeft;
    private final MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        this.topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        this.bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    @Override
    public void moveUp() {
        this.topLeft.y += this.topLeft.ySpeed;
        this.bottomRight.y += this.bottomRight.ySpeed;
    }

    @Override
    public void moveDown() {
        this.topLeft.y -= this.topLeft.ySpeed;
        this.bottomRight.y -=this.bottomRight.ySpeed;
    }

    @Override
    public void moveRight() {
        this.topLeft.x += this.topLeft.xSpeed;
        this.bottomRight.x += this.bottomRight.xSpeed;
    }

    @Override
    public void moveLeft() {
        this.topLeft.x -= this.topLeft.xSpeed;
        this.bottomRight.x -= this.bottomRight.xSpeed;
    }

    @Override
    public String toString() {
        return "x1: " + this.topLeft.x + "\ny1: " + this.topLeft.y +
                "\nx2: " + this.bottomRight.x + "\ny2: " + this.bottomRight.y + "\n";
    }
}
