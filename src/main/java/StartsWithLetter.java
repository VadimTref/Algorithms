public class StartsWithLetter {

    public String startsWithLetterL(String a) {
        if (Utils.isStringValid(a)) {

            String[] b = a.trim().split("[,. !?\n]+");
            String c = "";
            for (int i = 0; i < b.length; i++) {
                if (b[i].charAt(0) == 'l' || b[i].charAt(0) == 'L') {
                    c = c.concat(", ").concat(b[i]);
                }
            }

            return c.replaceFirst(", ", "");
        }

        return "";
    }
}
