import java.util.*;

public class RemovingDuplicates {
    public static void main(String[] args) {

        String a = "aassddvvffrr";
        System.out.println("String before removing duplicates: " + a);
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for (char c : a.toCharArray()) {
            set.add(c);
        }
        StringBuilder output = new StringBuilder();
        for (char c : set) {
            output.append(c);
        }
        System.out.println("String after removing duplicates: " + output.toString());


    }
}
