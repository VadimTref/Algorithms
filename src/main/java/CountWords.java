public class CountWords {

    public int countWordsInText(String a, String b) {
        if (Utils.isStringValid(a) && Utils.isStringValid(b)) {
            int sum = 0;
            String[] c = a.toLowerCase().split("[,.\\s+]");
            b = b.toLowerCase();
            for (int i = 0; i < c.length; i++) {
                if (c[i].equals(b)) {
                    sum++;
                }
            }

            return sum;
        }

        return 0;
    }
}
