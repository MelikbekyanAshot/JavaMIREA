package task1;

public class Complex {
    private final int real;
    private final int img;

    public Complex() {
        this.real = 1;
        this.img = -1;
    }

    public Complex(int real, int img) {
        this.real = real;
        this.img = img;
    }

    @Override
    public String toString() {
        return "Complex{" +
                "real=" + real +
                ", img=" + img +
                '}';
    }
}
