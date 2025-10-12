public class Update_IthBit {
    public static int Update(int n, int i , int newbit){
        if(newbit == 0){
            return n & (~(1<<i)); // clear ith bit (n,i)
        } else {
            return n | (1<<i);    // set ith bit (n,i)
        }
    }
    public static void main(String[] args) {
        System.out.println(Update(10,2,1));

    }
}
