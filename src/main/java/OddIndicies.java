public class OddIndicies {

    /**TASK 2
     Написать алгоритм OddIndices, который принимает массив чисел,
     и возвращает массив значений нечетных индексов
     Test Data:
     Input = {-45, 590, 234, 985, 12, 68}
     Expected Result =  {590, 985, 68}
     */

    public int[] valuesOfOddIndexes(int[] a) {
        int [] b = new int[a.length];
        int j = 0;
        for(int i = 1; i < a.length; i += 2) {
            b[j] = a[i];
            j++;
        }
        return b;
    }
}
