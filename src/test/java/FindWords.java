import java.util.*;

public class FindWords {

    // This class is created to test the assignment
    static public class MyDictionary {
        Set<String> myset;
        MyDictionary(){
            myset = new HashSet<String>();
        }
        public void addWord(String w){
            myset.add(w.toLowerCase(Locale.ROOT));
        }
        boolean isEnglishWord(String w){
            return myset.contains(w);
        }
    }
    static MyDictionary dic;
    //Finds all words in word "working" recursively
    static void recPrint(String word, int[] flag, String newWord){
        for(int i=0;i<flag.length;++i){
            if(flag[i]==0){
                flag[i] = 1;
                if(dic.isEnglishWord(newWord + word.charAt(i))){
                    System.out.println(newWord + word.charAt(i));
                }
                recPrint(word,flag,newWord + word.charAt(i));
                flag[i] = 0;
            }
        }

    }

    public static void main(String[] args) {
       //it is assumed that MyDictionary contained all English words
        dic  = new MyDictionary();
        dic.addWord("king");
        dic.addWord("go");
        dic.addWord("WIN"); //
        dic.addWord("wow"); //
        dic.addWord("working");
        dic.addWord("");

        // using the NULL to see if it is working, or using try catch
        String word = "working";


        int[] flag = new int[word.length()];

        recPrint(word,flag, "");

    }
}