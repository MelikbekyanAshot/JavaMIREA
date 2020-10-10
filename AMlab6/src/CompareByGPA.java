import java.util.Comparator;
import java.util.List;

public class CompareByGPA implements Comparator<Student> {

    public static void quickSortByGPA(List<Student> students, int leftBorder, int rightBorder) {
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        Student pivot = students.get((leftMarker + rightMarker) / 2);
        do {
            while (students.get(leftMarker).getGpa() > pivot.getGpa()) {
                leftMarker++;
            }

            while (students.get(rightMarker).getGpa() < pivot.getGpa()) {
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

    @Override
    public int compare(Student o1, Student o2) {
        return (int) (10*(o2.getGpa() - o1.getGpa()));
    }
}
