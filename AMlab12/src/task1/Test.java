package task1;

public class Test {
    public static void main(String[] args) {
        Person person = new Person("Меликбекян",  "Ашот",  "Арсенович");
        System.out.println(person.getSNP());

        Person person1 = new Person("Меликбекян", "Ашот");
        System.out.println(person1.getSNP());

        Person person2 = new Person("Меликбекян");
        System.out.println(person2.getSNP());
    }
}
