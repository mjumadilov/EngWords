import java.util.*;

public class HRJavaStringIntro {
    public static void main(String[] args) {



        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */

        String C = A+B;
        System.out.println(C.length());
        if(A.length()>B.length()){
            System.out.println("No");

        }else{
            System.out.println("Yes");

        }

        String D = A.toUpperCase().charAt(0)+A.substring(1, A.length()-1);
        String E = B.toUpperCase().charAt(0)+B.substring(1, B.length()-1);

        System.out.println(A+" "+B);



    }
}



