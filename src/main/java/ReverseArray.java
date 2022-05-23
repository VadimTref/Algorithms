public class ReverseArray {

    public int[] reverseArrayAlgorithm(int[] array) {
        if (Utils.arrIntNotEmpty(array)) {

            int[] result = new int[array.length];
            int count = array.length - 1;

            for (int i = 0; i < array.length; i++) {
                result[count] = array[i];
                count--;
            }

            return result;
        }
        return new int [0];
    }
}
