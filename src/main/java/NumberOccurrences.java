import java.util.Arrays;

public class NumberOccurrences {

    /**
     * TASK 15
     * Написать алгоритм NumberOccurrences, который принимает
     * на вход массив целых чисел, и возвращает массив пар
     * {число, сколько раз число встречается в массиве}
     * Test Data:
     * {3, 2, 5, 3, 1, 5, 4, 2, 1, 4, 5, 3, 2, 1, 4, 5, 3, 2, 1} →
     * {{1, 4}, {2, 4}, {3, 4}, {4, 3}, {5, 4}}
     */

    public int[][] numberOfOccurrences(int[] a) {
        if (Utils.arrIntNotEmpty(a)) {
//            for (int i = 0; i < a.length; i++) {
//                for (int j = i + 1; j < a.length; j++) {
//                    if (a[i] > a[j]) {
//                        int temp = a[i];
//                        a[i] = a[j];
//                        a[j] = temp;
//                    }
//                }
//            }
            Arrays.sort(a);

            int count = 1;
            for (int i = 0, j = 1; i < a.length - 1; i++, j++) {
                if (a[i] != a[j]) {
                    count++;
                }
            }

            int[][] b = new int[count][2];
            int k = 0;
            int numberCount = 1;
            for (int i = 0, j = 1; i < a.length - 1; i++, j++) {
                if (a[i] == a[j]) {
                    numberCount++;
                    b[k] = new int[]{a[i], numberCount};
                } else {
                    numberCount = 1;
                    k++;
                }
            }

            return b;
        }

        return new int[][]{};
    }
}







