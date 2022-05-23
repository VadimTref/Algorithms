public class MinMaxAve {

    /**
     * TASK 8
     * Написать алгоритм MinMaxAve, который принимает массив чисел int[]
     * и 2 значения индексов. Алгоритм возвращает массив, который содержит
     * минимальное значение, максимальное значение,
     * и среднее среди всех значений между 2-мя индексами.
     * Test Data:
     * ({1, 2, 3, 4, 5, 6, 7, 8}, 2, 6) →  {3, 7, 5}
     */

    public int[] minMaxAver(int[] a, int start, int end) {
        if (Utils.arrIntNotEmpty(a) && start >= 0 && end >= 0 &&
                end >= start && a.length >= end - start + 1) {
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            int sum = 0;
            int[] res = new int[3];
            for (int i = start; i < end + 1; i++) {
                if (a[i] < min) {
                    min = a[i];
                    res[0] = min;
                }
                if (a[i] > max) {
                    max = a[i];
                    res[1] = max;
                }
                sum += a[i];
                res[2] = sum / (end - start + 1);
            }
            return res;
        }
        return new int[0];
    }
}