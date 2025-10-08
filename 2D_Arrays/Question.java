public class Question {

    // Question 1

//    public static void main(String[] args) {
//        int array [][] = {{4,7,8},{8,8,7}};
//        int count = 0;
//        for(int i=0;i<array.length;i++){
//            for(int j=0;j<array[0].length;j++){
//                if (array[i][j] == 7){
//                    count++;
//                }
//            }
//        }
//        System.out.println(count);
//    }

    //Question 2
//

    // Question 3

    public static void main(String[] args) {
        int matrix[][] ={{1,2,3},
                         {4,5,6}};
        int row = 2 ;
        int col = 3 ;
        printMatrix(matrix);
        int transpose[][] = new int [col][row];
        for(int i =0 ;i<row;i++){
            for(int j =0 ;j<col;j++){
                transpose[j][i] = matrix[i][j];
            }
        }
        printMatrix(transpose);
    }
    public static void printMatrix(int[][] matrix){
        System.out.println("The Matrix is: ");
        for(int i = 0;i<matrix.length; i++){
            for(int j = 0;j<matrix[0].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}
