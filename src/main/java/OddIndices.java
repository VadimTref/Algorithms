import java.util.Arrays;
public class OddIndices {

    /**TASK 2
     Написать алгоритм OddIndices, который принимает массив чисел,
     и возвращает массив значений нечетных индексов
     Test Data:
     Input = {-45, 590, 234, 985, 12, 68}
     Expected Result =  {590, 985, 68}
     */

    public int[] valuesOfOddIndexes(int[] a) {
        if (Utils.arrIntNotEmpty(a)) {
            int[] result = new int[Utils.countOddIndexes(a)];
            int j = 0;
            for (int i = 0; i < a.length; i++) {
                if (i % 2 != 0) {
                    result[j] = a[i];
                    j++;
                }
            }
            System.out.println(Arrays.toString(result));
            return result;
        }
        return new int[0];
    }
}
