import java.util.Scanner;

public class esercizio8di1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("inserire numero");
        int numero = sc.nextInt();
        if(numero % 3 == 0){
            System.out.println("Fizz");
        } else if (numero % 5 == 0) {
            System.out.println("Buzz");
        }else{
            System.out.println("FizzBuzz");
        }
    }
}
