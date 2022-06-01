public class Utils {

    // check arr Int is not empty
    public static boolean arrIntNotEmpty (int [] a){

        return a.length != 0;
    }

    // check arr Double is not empty
    public static boolean arrDoubleNotEmpty (double [] a){
        if (a.length != 0) {

            return true;
        }

        return false;
    }

    // check arr String is not empty
    public static boolean arrStringNotEmpty (String [] a){
        if (a.length != 0) {

            return true;
        }

        return false;
    }

    // Count even numbers in Array
    public static int countEvenNumbers (int [] a){
        int countEven = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                countEven++;
            }
        }

        return countEven;
    }

    // Count odd indexes in Array
    public static int countOddIndexes (int [] a){
        int countOdd = 0;
        for (int i = 0; i < a.length; i++) {
            if (i % 2 != 0) {
                countOdd++;
            }
        }

        return countOdd;
    }

    // Sum of array's elements
    public static int sumOfElementsOfArray(int [] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }

        return sum;
    }

    public static boolean isStringValid (String a) {

        return a!=null && a.length() > 0;
    }
    
}
