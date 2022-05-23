public class PeakElement {

    /**
     * TASK 10
     Написать алгоритм PeakElement, который принимает на вход
     массив целых чисел и возвращает значения пиковых элементов
     (элементы, которые больше своих соседей).
     Test Data:
     {3, 2, 7, 5, 1, 9, 23, 1} → {3, 7, 23}
     */

    public int[] peakElement(int[] a) {
        if (a.length > 1) {
            int count = 0;
            for (int i = 0; i < a.length; i++){
                if (i == 0 && a[i] > a[i + 1]){
                    count++;
                } else if (i > 0 && i < a.length - 1 &&
                        a[i] > a[i + 1] && a[i] > a[i - 1]) {
                    count++;
                } else if (i == a.length - 1 &&
                        a[a.length - 1] > a[a.length - 2]) {
                    count++;
                }
            }

            int [] b = new int[count];
            int j = 0;
            for (int i = 0; i < a.length; i++){
                if (i == 0 && a[i] > a[i + 1]){
                    b[j] = a[i];
                    j++;
                } else if (i > 0 && i < a.length - 1 &&
                        a[i] > a[i + 1] && a[i] > a[i - 1]) {
                    b[j] = a[i];
                    j++;
                } else if (i == a.length - 1 &&
                        a[a.length - 1] > a[a.length - 2]) {
                    b[j] = a[a.length - 1];
                }
            }

            return b;
        }

        return new int[] {};
    }
}
