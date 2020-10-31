package task1;

public class Test {
    public static void main(String[] args) {
        ComplexAbstractFactory firstFactory = new ConcreteFactory();
        System.out.println(firstFactory.createComplex());
        System.out.println(firstFactory.createComplex(7, -8));
    }
}
