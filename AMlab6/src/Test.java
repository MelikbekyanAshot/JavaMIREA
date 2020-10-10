import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student(1810, "Воронов", 4.2));
        students.add(new Student(1911, "Смирнов", 4.5));
        students.add(new Student(2201, "Соколов", 3.8));
        students.add(new Student(1297, "Соловьева", 4.8));
        students.add(new Student(2518, "Трофимова", 3.5));
        students.add(new Student(1111, "Перова", 3.2));

        System.out.println("Сортировка вставками по ID:");
        CompareByID.insertSortByIDNumber(students);
        System.out.print(students + "\n");
        System.out.println("--------------------------------------------------------");

        System.out.println("Быстрая сортировка по GPA:");
        Comparator<Student> compareByGPA = new CompareByGPA();
        System.out.println("Без компаратора");
        CompareByGPA.quickSortByGPA(students, 0, students.size()-1);
        System.out.println(students + "\n");
        System.out.println("С компаратором");
        students.sort(compareByGPA);
        System.out.print(students + "\n");
        System.out.println("--------------------------------------------------------");

        System.out.print("Сортировка слиянием по GPA");
        Student[] students2 = new Student[5];
        students2[0] = new Student(1551, "Кузнецов", 2.9);
        students2[1] = new Student(1552, "Воробьев", 3.9);
        students2[2] = new Student(1553, "Краснов", 3.8);
        students2[3] = new Student(1554, "Чернов", 2.7);
        students2[4] = new Student(1555, "Белов", 3.6);
        MergeSort.mergeSort(students2, 0, students2.length);
        for (Student student : students2) {
            System.out.print(student);
        }
    }

}
