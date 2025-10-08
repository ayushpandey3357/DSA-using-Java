public class Spiral_Matrix {
    public static void spiralmatrix(int[][] matrix) {
        int startrows = 0;
        int startcol = 0 ;
        int endrows = matrix.length - 1;
        int endcol = matrix[0].length - 1;
        while(startrows <= endrows && startcol <= endcol) {
            for(int j = startcol; j <= endcol; j++) {
                System.out.print(matrix[startrows][j] + " ");
            }
            for(int i = startrows+1; i <= endrows; i++) {
                System.out.print(matrix[i][endcol] + " ");
            }
            for(int j = endcol-1; j >= startcol; j--) {
                if(startrows == endrows) {
                    break;
                }
                System.out.print(matrix[endrows][j] + " ");
            }
            for(int i = endrows-1; i > startrows; i--) {
                if(startcol == endcol) {
                    break;
                }
                System.out.print(matrix[i][startcol] + " ");
            }
            startrows++;
            startcol++;
            endrows--;
            endcol--;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},
                          {5,6,7,8},
                          {9,10,11,12},
                          {13,14,15,16}};
        spiralmatrix(matrix);

    }
}
