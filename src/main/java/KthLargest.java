public class KthLargest {

    /**
     * TASK 12
     Написать алгоритм KthLargest, который принимает на вход массив целых чисел
     и число k, и возвращает k-тый максимальный элемент.
     Test Data:
     ({4, 3, 7, 12, 5, 2, 9, 4, 12}, 3) → 9
     (12 и 12 - первый и второй самые большие элементы)
     */

    public int kthLargestElement(int[] a, int k) {
        if (k > 0 && a.length >= k) {
            for (int i = 0; i < a.length; i++) {
                for (int j = i + 1; j < a.length; j++) {
                    if (a[i] > a[j]) {
                        int temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;
                    }
                }
            }

            return a[a.length - k];
        }

        return 0;
    }
}
