import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        //Student[] students = new Student[5];
        Comparator<Student> compareByID = new CompareByID();

        Student Ivan = new Student(1810, "Воронов", 4.2);
        Student Alexander = new Student(1911, "Смирнов", 4.5);
        Student Peter = new Student(2201, "Соколов", 3.8);
        Student Ann = new Student(1297, "Соловьева", 4.8);
        Student Maria = new Student(2518, "Трофимова", 3.5);
        Student Kate = new Student(1111, "Перова", 3.2);

        students.add(Ivan);
        students.add(Alexander);
        students.add(Peter);
        students.add(Ann);
        students.add(Maria);
        students.add(Kate);

        System.out.println("Сортировка по ID:");
        CompareByID.insertSortByIDNumber(students, compareByID);
        System.out.println(students + "\n");

        System.out.println("Сортировка по GPA");
        CompareByGPA.quickSortByGPA(students, 0, students.size()-1);
        System.out.println(students + "\n");

        System.out.println("Сортировка слиянием"); //TODO понять, что не так с этим
        MergeTwoArrays.mergeSort(students, 0, students.size()-1);
        System.out.println(students + "\n");
    }

}
