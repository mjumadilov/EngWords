public class ReverseSentencesInMethod {

    public static String reverse(String input) {

        String reversed = "";
        String sentences[] = input.split(" ");

        for (int i = sentences.length - 1; i >= 0; i--) {
            reversed += sentences[i]+" ";
        }
        return reversed;
    }

    public static void main(String[] args) {
        String original = "Hello World !";
        String reversed = reverse(original); // Call the method
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
    }

}
