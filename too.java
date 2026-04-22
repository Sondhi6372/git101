public class too {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int sum = a + b;
        int Sumloop = 0 ;
        System.out.println("The sum of a and b is: " + sum);

        int mul = a * b;
        System.out.println("The mul of a and b is: " + mul);
        for (int i = 0 ; i <= b ; i++ ){
            Sumloop += i;
         
        }
    }
}