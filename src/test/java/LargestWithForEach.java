public class LargestWithForEach {

    public static void main(String[] args) {



        int a [] = {5,4,2,7,8,3,1};
        int b = a[0];

        for(int c:a){
            if(b<c){
                b=c;
            }

        }
        System.out.println(b);
    }
}
