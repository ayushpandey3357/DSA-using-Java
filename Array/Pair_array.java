public class Pair_array {
    public static void Printpairs(int num[]){
        int totalpairs = 0;
        for(int i=0;i<num.length;i++){
            int curr = num[i];
            for(int j=i+1;j<num.length;j++){
                System.out.print("("+curr+","+num[j]+")");
                totalpairs++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int num [] = {2,3,4,5,6};
        Printpairs(num);
    }
}
