public class OddEven {

    /**TASK 1
     * Создать алгоритм OddEven, который принимает на вход целое число,
     * возвращает “Odd”, если число нечетное, и “Even”, если число четное.
     * Во всех остальных случаях результат будет “Undefined”.
     * Test Data:
     * -345 →  “Odd”
     * 0 →  “Even”
     * 222222 →  “Even”
     * 2147483647 + 1 →  “Undefined”
     */

    public String oddOrEvenNumber(int a){
        if (a == (int) a && a < Integer.MAX_VALUE && a > Integer.MIN_VALUE) {
            if (a % 2 != 0) {
                return "Odd";
            } else {
                return "Even";
            }
        } else {
            return "Undefined";
        }
    }
}
