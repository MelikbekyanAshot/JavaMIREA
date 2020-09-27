import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Student {
    private final int idNumber;
    private final String surname;
    private final double gpa;

    public Student(int idNumber, String surname, double gpa) {
        this.idNumber = idNumber;
        this.surname = surname;
        this.gpa = gpa;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public String getSurname() {
        return surname;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "\n" + surname + " " + idNumber + " " + gpa;
    }
}
