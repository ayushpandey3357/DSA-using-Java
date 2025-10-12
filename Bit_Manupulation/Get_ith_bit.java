public class Get_ith_bit {
    public static int getith_bit(int n , int i){
        int bitmask = 1 << i ;
        if ((n & bitmask) == 0) {
            return 0 ;
        } else{
            return 1 ;
        }

    }
    public static void main(String[] args) {
        System.out.println(getith_bit(10,2));

    }
}
