package TASK4;

import java.util.Arrays;
import java.util.Comparator;

public class GenericQuickSort <T extends Comparable> {
    public void qsort(T[] mas, int l, int r){
        if (l < r) {
            int i = l, j = r;
            T x = mas[(i + j) / 2];
            do {
                while (mas[i].compareTo(x) < 0) i++;
                while (x.compareTo(mas[j]) < 0) j--;

                if (i <= j) {
                    T tmp = mas[i];
                    mas[i] = mas[j];
                    mas[j] = tmp;
                    i++;
                    j--;
                }

            } while (i <= j);

            qsort(mas, l, j);
            qsort(mas, i, r);
        }
    }
}
