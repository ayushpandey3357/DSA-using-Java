import java.util.Scanner;

public class Print_1_to_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int counter = 0;
        while (counter <= n){
            System.out.println(counter);
            counter++;
        }
    }
}
