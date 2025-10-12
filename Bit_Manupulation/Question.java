import java.util.Scanner;

//public class Question {
//    public static int q1(int x){
//        return x^x ;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        System.out.println(q1(x));
//
//    }
//}

//public class Question{
    //Q2
//    public static void main(String[] args) {
//        int x = 3 ;
//        int y = 5;
//        System.out.println("x =" + x + " y =" + y );
//        x = x^y;
//        y = x^y;
//        x = x^y;
//        System.out.println("x =" + x + " y =" + y );
//    }

    //Q3

//    public static void main(String[] args) {
//        int x = 6;
//        System.out.println(x + " + " + 1 + " is " + -~x);
//    }

    //Q4

//    public static void main(String[] args) {
//        for( char ch = 'A'; ch <= 'Z'; ch++){
//            System.out.println((char) (ch | ' '));
//        }
//    }
//}
class Solution {
    public static int minBitFlips(int start, int goal) {
        int count = 0 ;
        for(int i = 0 ; i <= 1 ; i++){
            if((start ^ goal) == 1){
                count++;
            }

        }
        return count;

    }

    public static void main(String[] args) {
        System.out.println(minBitFlips(10,7));
    }
}