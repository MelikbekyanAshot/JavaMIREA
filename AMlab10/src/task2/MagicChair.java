package task2;

public class MagicChair implements Chair {

    public void doMagic() {
        System.out.println("This is a magic");
    }

    @Override
    public String toString() {
        return "Magic Chair";
    }

    @Override
    public void sit() {
        System.out.println("Sitting on Magic Chair");
        doMagic();
    }
}
