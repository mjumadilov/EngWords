public class TwoReversing {
    public static void main(String[] args) {


        String a = "manual";
        String aa ="testing";

        String b="";
        String c="";


        for(int i = a.length()-1; i>=0; i--){
            b= b+ a.charAt(i);
        }
        System.out.println(b);

        char d[] = aa.toCharArray();
        for(int i = d.length-1; i>=0; i--){
            c= c+d[i];
        }
        System.out.println(c);

    }
}
