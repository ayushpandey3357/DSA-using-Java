public class Max_SubArray_Prefix {
    public static void maxarray(int num []){
        int curr = 0 ;
        int maxsum = Integer.MIN_VALUE ;
        int prefix[] = new int [num.length];
        prefix[0] = num[0];
        for (int i = 1; i < prefix.length; i++){
            prefix[i] = prefix[i-1] + num[i];
        }
        for (int i = 1; i < num.length; i++){
            int start = i ;
            for (int j = i ; j < num.length ; j++){
                int end = j ;
                curr = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
                if (curr > maxsum){
                    maxsum = curr ;
                }
            }
        }
        System.out.println(maxsum);
    }
    public static void main(String[] args) {
        int num [] = {1 , -2 , 6, -1, 3};
        maxarray(num);
    }
}
