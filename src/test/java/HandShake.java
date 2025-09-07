public class HandShake {
    public static void main(String[] args) {

        int ppl = 10;

        int shake =0;


        for(int i =0; i<ppl; i++){

for(int j = i+1; j< ppl; j++){
    shake++;
}
        }

        System.out.println(shake);


        shake = ppl*(ppl-1)/2;
        System.out.println(shake);

    }
}
