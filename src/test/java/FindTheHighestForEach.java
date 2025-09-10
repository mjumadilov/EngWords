public class FindTheHighestForEach {

    public static int a(int [] a){
int max = a[0];

for(int b: a){
    if(b>max){
        max =b;
    }
}
return max;
    }

    public static void main(String[] args) {

        int[] numbers = {12, 45, 7, 89, 23, 56};
        int max = a(numbers); // Call the method
        System.out.println("The highest element is: " + max);
    }

}
