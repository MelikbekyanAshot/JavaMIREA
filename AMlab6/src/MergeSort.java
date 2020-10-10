import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {
    public static void mergeSort(Student[] array, int left, int right) {

        if (right <= left + 1) {
            return;
        }

        int mid = left + (right - left) / 2;

        mergeSort(array, left, mid);
        mergeSort(array, mid, right);

        merge(array, left, mid, right);
    }

    private static void merge(Student[] array, int left, int middle, int right) {
        int i = left;
        int j = middle;
        int k = 0;

        Student[] temp = new Student[right - left];

        while (i < middle && j < right) {
            if (array[i].getGpa() <= array[j].getGpa()) {
                temp[k] = array[i];
                i++;
            } else {
                temp[k] = array[j];
                j++;
            }
            k++;
        }

        for (;i < middle; i++, k++) {
            temp[k] = array[i];
        }

        for (;j < right; j++, k++) {
            temp[k] = array[j];
        }

        System.arraycopy(temp, 0, array, left, temp.length);
    }
}