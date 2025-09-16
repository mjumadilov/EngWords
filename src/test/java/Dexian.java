public class Dexian {

    public static void main(String[] args) {

        String a = "Madam";

        String b ="";

        char c []= a.toCharArray();

        for(int i = c.length-1; i>=0; i--){
            b=b+c[i];
        }
        if(b.equals(a)){
            System.out.println("Polindrome");
        }else{
            System.out.println("Not polindrome");
        }
        //System.out.println("After the reversing : "+b);

    }
}
