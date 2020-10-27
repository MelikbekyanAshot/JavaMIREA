package task2;

public class Student implements Comparable<Student>, LabClassUI {
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

    @Override
    public int compareTo(Student o) {
        return (int) (10*(this.getGpa() - o.getGpa()));
    }
}
