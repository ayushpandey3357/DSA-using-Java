public class Sub_Array {
    public static void subarray(int num[]){
        for(int i=0;i<num.length;i++){
            for(int j=i ;j<num.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(num[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int num[] = { 2,3,4,5,6};
        subarray(num);
    }
}
