import java.util.Scanner;

public class Factorial {
    public static int factorial() {
        Scanner sc = new Scanner(System.in);
        int count = 1 ;
        int n = sc.nextInt();
        for (int i =1; i <= n;i++) {
            count = count*i;


        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(factorial());
    }
}
