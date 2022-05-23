public class StringIntersection {

    public String intersectionOf2Strings(String a, String b) {

        if (Utils.isStringValid(a) && Utils.isStringValid(b)) {
            a = a.trim().toLowerCase();
            b = b.trim().toLowerCase();
            String c = "";
            for (int i = 0; i < a.length(); i++) {
                for (int j = 0; j < b.length(); j++) {
                    if (a.charAt(i) == b.charAt(j)) {
                        c = c.concat(String.valueOf(b.charAt(j)));
                        b = b.substring(j + 1);
                        break;
                    }
                }
            }

            return c;
        }

        return "";
    }
}
