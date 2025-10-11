public class Linear_Search {
    public static int linearSearch(int num[],int key) {
        for(int i = 0; i < num.length; i++){

            if (num[i] == key){
                return i;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int num[] = {2,4,6,8,10,14,12};
        int key = 10 ;
        int index = linearSearch(num,key);
        for(int i = 0; i < num.length; i++){
            if(index == -1){
                System.out.println("Not Found");
                break;
            } else {
                System.out.println("Found =" + index);
                break;
            }
        }
    }
}
