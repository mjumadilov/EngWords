public class ReverseSenInMethod {

    public static String reverse(String input) {

        String reversed="";
        for(int i = input.length()-1; i>=0; i--){
            reversed += input.charAt(i);
        }


        return reversed;

    }

    public static void main(String[] args) {
        String original = "Hello World!";
        String reversed = reverse(original); // Call the method
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
    }
}
