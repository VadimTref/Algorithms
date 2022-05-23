public class RemoveDuplicates {
    public String removeDuplicatesInString(String a) {
        if (Utils.isStringValid(a)) {
            a = a.trim().toLowerCase();
            String b = "";
            char [] arr = a.toCharArray();
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        arr[j] = 'D';
                    }
                }
            }
            for (int i = 0; i < arr.length; i++) {
                if ((arr[i] > 96 && arr[i] < 123) && arr[i] != 'D') {
                    b = b.concat(Character.toString(arr[i]));
                }
            }

            return b;
        }

        return "";
    }
}
