package task2;

public class FindStudent {

    public static boolean findStudent(Student[] students, String surname) throws StudentNotFoundException {
        for (Student student : students) {
            if (student.getSurname().equals(surname)) {
                return true;
            }
        }
        throw new StudentNotFoundException("Студент с такой фамилией не найден");
    }

}
