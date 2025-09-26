public class UniqueCharMethod {

    public static String gettingUniqueChar(String word) {
        String uniqueChar = "";
        for (int i = 0; i < word.length(); i++) {
            if (!uniqueChar.contains(word.charAt(i) + "")) {
                uniqueChar += word.charAt(i);
            }
        }
            return uniqueChar;


        }

    public static void main(String[] args) {
        String word = "aabbccddeeff";
        System.out.println(word);
        String unique = gettingUniqueChar(word);
        System.out.println(unique);
    }
    }



