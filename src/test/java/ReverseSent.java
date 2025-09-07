public class ReverseSent
{

    public static void main(String[] args) {


        String a = "Lets keep coding to keep the knowledge sharp";

        String b="";

        String [] c = a.split(" ");

        for(int i = c.length-1; i >= 0; i--){
            b+=c[i]+ " ";
        }

        System.out.println(b);

    }}
