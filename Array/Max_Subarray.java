public class Max_Subarray {
    public static void maxarray(int num []){
        int max = Integer.MIN_VALUE;
        int curr = 0 ;
        for(int i=0;i<num.length;i++){
            int start = 1 ;
            for(int j=i;j<num.length;j++){
                int end = j ;
                curr = 0 ;
                for(int k=i;k<=j;k++){
                    curr += num[k];
                }
                System.out.println(curr);
                if(max < curr){
                    max = curr;
                }
            }
        }
        System.out.println("max sum " + max );

    }    public static void main(String[] args) {
        int num [] = {2,4,6,8,10};
        maxarray(num);
    }
}
