public class NewOne {

    public static void main(String[] args) {


        int a [] = {2,3,4,5,1,7};

        int b =0 ;

        for(int i =0; i <=a.length-1; i++){
            if(b< a[i]){
                b=a[i];

            }
        }
        System.out.println(b);
        System.out.println(a[a.length-1]);
        System.out.println(a[0]);



    }
}
