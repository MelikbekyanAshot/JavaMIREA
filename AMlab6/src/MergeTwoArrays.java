import java.util.List;

public class MergeTwoArrays {
    public static void mergeSort(List<Student> students, int left, int right) {
        int delimiter = left + ((right - left) / 2) + 1;

        if (delimiter > 0 && right > (left + 1)) {
            mergeSort(students, left, delimiter - 1);
            mergeSort(students, delimiter, right);
        }

        Student[] buffer = new Student[right - left + 1];

        int cursor = left;
        for (int i = 0; i < buffer.length; i++) {
            if (delimiter > right || students.get(cursor).getGpa() > students.get(delimiter).getGpa()) {
                buffer[i] = students.get(cursor);
                cursor++;
            } else {
                buffer[i] = students.get(delimiter);
                delimiter++;
            }
        }
        System.arraycopy(buffer, 0, students.toArray(), left, buffer.length);
    }
}
