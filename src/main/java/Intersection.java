public class Intersection {

    /**
     * TASK 9
     * Написать алгоритм Intersection, который принимает на вход
     * 2 массива целых чисел и возвращает массив общих элементов.
     * Test Data:
     * {1, 2, 4, 5, 89}, {8, 9, 4, 2} → {2, 4}
     * {1, 2, 4, 5, 8, 9}, {8, 9, -4, -2} → {8, 9}
     * {1, 2, 4, 5, 89}, {8, 9, 45} → {}
     */

    public int[] intersectionAB(int[] a, int[] b) {
        if (a.length != 0 && b.length != 0) {
            int count = 0;
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < b.length; j++) {
                    if (a[i] == b[j]) {
                        count++;
                    }
                }
            }
            int[] c = new int[count];
            int k = 0;
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < b.length; j++) {
                    if (a[i] == b[j]) {
                        c[k] = b[j];
                        k++;
                    }
                }
            }

            return c;
        }

        return new int[]{};
    }
}
