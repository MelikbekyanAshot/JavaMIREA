import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompareByID implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getIdNumber() - o2.getIdNumber();
    }

    public static void insertSortByIDNumber(List<Student> students, Comparator<Student> comparator) {
        for (int left = 0; left < students.size(); left++) {
            int value = students.get(left).getIdNumber();
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value < students.get(i).getIdNumber()) {
                    Collections.swap(students, i + 1, i);
                } else {
                    break;
                }
            }
        }
    }
}
