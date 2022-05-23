public class ReverseString {

    public String reverseStringBack(String a) {
        if(Utils.isStringValid(a)) {
            String b = "";
            for(int i = a.length() - 1; i >= 0; i--) {
                b = b.concat(String.valueOf(a.charAt(i)));
//                b = b.concat(Character.toString(a.charAt(i)));
            }

            return b;
        }

        return "";
    }
}
