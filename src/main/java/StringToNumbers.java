public class StringToNumbers {

    /**
     * TASK 15
     Написать алгоритм StringToNumbers, который принимает строку,
     и возвращает массив чисел:
     Test Data:
     “1, 2, 3, 4, 5” → {1, 2, 3, 4, 5}
     (Без форматирования)

     */

    public int[] stringToArrNumbers(String a){
        if (Utils.isStringValid(a)) {
            a = a.trim();

            int count = 0;
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) > 47 && a.charAt(i) < 58) {
                    count++;
                }
            }

            int [] b = new int[count];
            int j = 0;
            for (int i = 0; i < a.length(); i++){
               if (a.charAt(i) > 47 && a.charAt(i) < 58) {
                   b[j] = Integer.parseInt(Character.toString(a.charAt(i)));
                   j++;
               }
            }

            return b;
        }

        return new int []{};
    }
}
