public class TestAuthor {
    public static void main(String[] args) {
        System.out.println("Test of class Author");
        Author author = new Author("Melikbekyan Ashot", "melikbekyan.ashot@yandex.ru", 'M');
        System.out.println(author.toString());
        System.out.println("Now we want to change email to melikbekyan.ashot01@gmail.com");
        System.out.println("Old email: " + author.getEmail());
        author.setEmail("melikbekyan.ashot01@gmail.com");
        System.out.println("New email: " + author.getEmail());
    }
}
