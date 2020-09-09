public class Ball {
    private double x = 0.0;
    private double y = 0.0;

    public Ball() {}

    public Ball(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void move(double xDisp, double yDisp) {
        this.x = x + xDisp;
        this.y = y + yDisp;
    }

    @Override
    public String toString() {
        return "Ball @ (" + this.x + ", " + this.y + ")";
    }
}
