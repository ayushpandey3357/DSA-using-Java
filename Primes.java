import java.util.Scanner;

public class Primes {
    public static boolean isprime(int n) {
        if (n == 2) {
            return true;
        }
        for (int i = 2 ; i <= Math.sqrt(n); i++) {
            if(n % i == 0 ){
                return false ;
            }
        }
        return true;

    }

    public static void primesInranges(int n) {
        for (int i = 2; i <= n ; i++){
            if(isprime(i)){
                System.out.println(i + " ");
            }
        }
        System.out.println(n);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        primesInranges(n);
    }
}
