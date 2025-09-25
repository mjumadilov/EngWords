public class UniqueChar {

    public static void main(String[] args) {

        String a = "qwerafsgsfgbvaaaacvsdfgds";
        String unique="";

        for(int i=0; i<a.length();i++){
            if(!unique.contains(a.charAt(i)+"")){
                unique+=a.charAt(i);
            }
        }

        System.out.println(unique);
    }
}
