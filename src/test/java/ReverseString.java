public class ReverseString

{

    public static void main(String[] args) {



        String s = "Welcome";

        String b="";

        char c [] = s.toCharArray();

        for(int i =c.length-1; i>=0; i--){
            b = b+c[i];
        }

        System.out.println(b);
    }
}
