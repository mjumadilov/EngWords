public class Fibbanocci {

    public static void main(String[] args) {

        int fb = 10;
        int a = 1;
        int b = 0;
        System.out.println( a + " " +b + " ");

for(int i = 2; i< fb; i++){
    int c = b +a;
    System.out.print(c+ " ");
    a = b;
    b = c;

}

    }
}
