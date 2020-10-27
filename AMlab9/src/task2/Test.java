package task2;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        LabClassUI[] students = new Student[5];
        students[0] = new Student(123456, "Иванов", 5.0);
        students[1] = new Student(914192, "Поляков", 4.9);
        students[2] = new Student(460123, "Смирнов", 3.2);
        students[3] = new Student(412412, "Оводов", 4.0);
        students[4] = new Student(120120, "Петров", 3.8);

        System.out.println("Массив студентов: " + Arrays.toString(students) + "\n");

        System.out.println("Тестирование поиска студента по фамилии");
        Scanner keyboard = new Scanner(System.in);
        String searchSurname = null;
        String next = "Да";
        boolean found = true;
        while (next.equals("Да")) {
            try {
                System.out.println("Введите фамилию студента: ");
                searchSurname = keyboard.next();
                if (!FindStudent.findStudent((Student[]) students, searchSurname)) {

                    throw new StudentNotFoundException("Студент с такой фамилией не найден");
                }
            } catch (StudentNotFoundException e) {
                found = false;
                e.printStackTrace();
            } finally {
                if (found) {
                    System.out.println("Студент с фамилией " + searchSurname + " найден");
                }
                System.out.println("Желаете ли вы продолжить? Введите 'Да' для продолжения или 'Нет' для завершения");
                next = keyboard.next();
            }
        }

    }
}
