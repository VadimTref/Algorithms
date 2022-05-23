public class SumOfTwo {

    /**
     * TASK 14
     * Написать алгоритм SumOfTwo, который принимает на вход
     * массив целых чисел, и число n.
     * Алгоритм возвращает пары элементов, которые в сумме дают число n.
     * Test Data:
     * ({4, 3, 7, 12, 5, 2, 9, 4, 12}, 12)  → {{3, 9}, {7, 5}}
     */

    public int[][] sumOfTwoEl(int[] a, int n) {
        if (a.length >= 2) {
            int count = 0;
            for (int i = 0; i < a.length; i++) {
                for (int j = i + 1; j < a.length; j++) {
                    if (a[i] + a[j] == n) {
                        count++;
                    }
                }
            }
            int[][] b = new int[count][2];
            int k = 0;
            for (int i = 0; i < a.length; i++) {
                for (int j = i + 1; j < a.length; j++) {
                    if (a[i] + a[j] == n) {
                        b[k][0] = a[i];
                        b[k][1] = a[j];
                        k++;
                    }
                }
            }

            return b;
        }

        return new int[][]{};
    }

}
