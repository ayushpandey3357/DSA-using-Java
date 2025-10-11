public class Smallest_Array {
    public static int getsmallest(int num[]){
        int smallest = Integer.MAX_VALUE;
        for (int i = 0 ; i < num.length; i++ ){
            if (num[i] < smallest){
                smallest = num[i];
            }
        }
        return smallest;
    }
    public static void main(String[] args) {
        int num[] =  {12,34,6,5,77,1,4};
        System.out.println(getsmallest(num));
    }
}
