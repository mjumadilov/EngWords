public class ReverseStrings {

    public static void main(String[] args) {

        String s = "Java is fun to learn";

        String ss ="";

       String [] sss = s.split(" ");
       for(int i = sss.length-1; i<=0; i--){
           ss=ss+sss[i];
       }
        System.out.println(ss);
    }
}
