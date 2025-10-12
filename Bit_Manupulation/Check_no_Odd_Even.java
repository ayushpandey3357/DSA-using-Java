public class Check_no_Odd_Even {
    public static void EvenOdd(int n){
        int Bitmask = 1 ;
        if((n & Bitmask) == 0){
            System.out.println(n + " = Even Number");
        } else {
            System.out.println(n + " = Odd Number");
        }
    }
    public static void main(String[] args) {
        EvenOdd(5);
        EvenOdd(6);
        EvenOdd(7);


    }
}
