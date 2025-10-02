public class Hollow_Rectangle {
    public static void hollow_rectangle(int totRows, int totCols) {
        for(int i = 1; i <= totRows; i++) {
            for(int j = 1; j <= totCols; j++) {
                if(i == totRows || i == 1 || j  == totCols || j == 1 ){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        hollow_rectangle(4 , 5);

    }
}
