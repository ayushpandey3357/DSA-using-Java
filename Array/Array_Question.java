import java.util.Scanner;

public class Array_Question {
    public static boolean sameindex(int[] num){
        for(int i=0;i<num.length-1;i++){
            for(int j=i+1 ;j<num.length ;j++){
                if(num[i]==num[j]){
                    return true ;
                }
            }
        }
        return false;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num[] = {1,2,3,4,2,1};
        System.out.println(sameindex(num));

    }
}
