import java.util.Comparator;
import java.util.List;

public class CompareByGPA implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return (int) (10*(o1.getGpa() - o2.getGpa()));
    }

/*    public static void quickSort(Student[] students, Comparator<Student> comparator) {
        quickSort(students, students[0], students[students.length-1]);
    }*/

    public static void quickSortByGPA(List<Student> students, int leftBorder, int rightBorder) {
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        Student pivot = students.get((leftMarker + rightMarker) / 2);
        do {
            while (students.get(leftMarker).getGpa() < pivot.getGpa()) {
                leftMarker++;
            }

            while (students.get(rightMarker).getGpa() > pivot.getGpa()) {
                rightMarker--;
            }

            if (leftMarker <= rightMarker) {
                if (leftMarker < rightMarker) {
                    Student tempStudent = students.get(leftMarker);
                    students.set(leftMarker, students.get(rightMarker));
                    students.set(rightMarker, tempStudent);
                }
                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);

        if (leftMarker < rightBorder) {
            quickSortByGPA(students, leftMarker, rightBorder);
        }

        if (leftBorder < rightMarker) {
            quickSortByGPA(students, leftBorder, rightMarker);
        }
    }
}
