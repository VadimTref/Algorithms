public class SumArray {

    /**TASK 3
     Написать алгоритм SumArray, который возвращает сумму всех чисел массива
     Test Data:
     {0, 1, 2, 3, 4, 5} → 15
     {-7, -3} → -10
     */

    public int sumOfArray(int[] a) {
        if (Utils.arrIntNotEmpty(a)) {

            return (Utils.sumOfElementsOfArray(a));
        }

        return 0;
    }



}
