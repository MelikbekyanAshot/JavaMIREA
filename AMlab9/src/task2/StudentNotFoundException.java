package task2;

public class StudentNotFoundException extends Exception {
    StudentNotFoundException(String errorMessage) {
        super(errorMessage);
    }
}
