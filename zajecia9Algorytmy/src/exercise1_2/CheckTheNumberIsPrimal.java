package exercise1_2;

import java.util.Scanner;

public class CheckTheNumberIsPrimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź swoją liczbę: ");
        int number = scanner.nextInt();

        if(numberIsPrime(number)){
            System.out.println(number + " Jest liczbą pierwszą");
        }
        else{
            System.out.println(number + " Nie jest liczbą pierwszą");
        }
    }

    private static boolean numberIsPrime(int number) {
        if(number <= 1){
            return false;
        }
        for(int i = 2; i < Math.sqrt(number); i++){
            if(number % i == 0 || i > 100_000){
                return false;
            }
        }
        return true;
    }
}
