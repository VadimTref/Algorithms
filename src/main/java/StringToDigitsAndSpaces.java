public class StringToDigitsAndSpaces {

    public String stringToDigitsAndSpacesOnly (String a){

        if(Utils.isStringValid(a)) {
            String b = "";
            for (int i = 0; i < a.length(); i++){
                if (Character.isSpaceChar(a.charAt(i)) ||
                        Character.isDigit(a.charAt(i))) {
                    b = b.concat(String.valueOf(a.charAt(i)));
                }
            }

            return b;
        }

        return "";
    }
}
