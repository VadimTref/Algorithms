import java.util.Arrays;

public class SortArray {

    /**
     * TASK 11
     * Написать алгоритм SortArray, который принимает на вход массив целых чисел,
     * и сортирует элементы массива в порядке возрастания.
     * Test Data:
     * {4, 3, 7, 12, 5, 2, 9, 4, 12} → {2, 3, 4, 4, 5, 7, 9, 12, 12}
     */

    public int[] sortArray(int[] a) {
        if (Utils.arrIntNotEmpty(a)) {
            for (int i = 0; i < a.length; i++) {
                for (int j = i + 1; j < a.length; j++) {
                    if (a[i] > a[j]) {
                        int temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;
                    }
                }
            }

            return a;
        }

        return new int[]{};
    }


}
