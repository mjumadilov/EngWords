public class ReversingSentences {

    public static void main(String[] args) {



        String s= "This needs to be done without looking for help";

        String ss="";

        String [] sss = s.split(" ");

        for(int i = sss.length-1; i>=0; i--){
            ss = ss+sss[i]+ " ";
        }

        System.out.println(ss);
    }
}
