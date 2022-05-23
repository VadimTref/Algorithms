public class NegativeOnTheRight {

    /**
     * TASK 13
     Написать алгоритм NegativeOnTheRight, который принимает на вход
     массив целых чисел, и возвращает массив, в котором все негативные числа
     находятся во второй половине массива
     Test Data:
     {4, -3, 7, -12, 5, -2, 9, 4, 12} → {4, 7, 5, 9, 4, 12, -3, -12, -2}
     */

    public int[] negativeElOnTheRight(int [] a) {
        if (Utils.arrIntNotEmpty(a)) {
            int [] result = new int[a.length];
            int indexToRight = result.length - 1;
            int indexToLeft = 0;
            for (int i = 0; i < a.length; i++) {
                    if (a[i] < 0) {
                        result[indexToRight] = a[i];
                        indexToRight--;
                    } else {
                        result[indexToLeft] = a[i];
                        indexToLeft++;
                    }
            }

            return result;
        }

        return new int[]{};
    }
}
