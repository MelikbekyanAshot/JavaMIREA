package task2;


public class Test {
    public static void main(String[] args) {
        Address address = new Address();

        address.setAddress1("Россия,Московская область,Химки,Горшина,3,2,1");
        System.out.println(address);

        address.setAddress2("Россия;Московская область;Химки;Горшина;3;2;1");
        System.out.println(address);
    }
}
