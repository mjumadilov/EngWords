public class Coding {

    public static void main(String[] args) {

        String word = "aabbccddeeffgg";
        String unique="";
        System.out.println("original characters : "+word);

      for(int i =0; i< word.length(); i++){
          if(!unique.contains(word.charAt(i)+"")){
              unique+=word.charAt(i);
          }
      }

        System.out.println("unique characters : "+unique);
    }
}
