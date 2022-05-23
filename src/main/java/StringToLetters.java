public class StringToLetters {

    public String stringToLettersOnly (String a){

        if(Utils.isStringValid(a)) {
            String b = "";
            for (int i = 0; i < a.length(); i++){
                if (Character.isLetter(a.charAt(i))) {
                    b = b.concat(String.valueOf(a.charAt(i)));
                }
            }

            return b;
        }

        return "";
    }
}
