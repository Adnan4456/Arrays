public class Matrix2DArray {
    public static void main(String[] args) {

        //Number of cloumns are same
        int[][] matrixArray = new int[2][2];

        matrixArray[0][0] = 1;
        matrixArray[0][1] = 2;

        matrixArray[1][0] = 3;
        matrixArray[1][1] = 4;

        for (int i = 0; i < 2; i++){

            for (int j = 0 ; j< 2; j++)
            {
                System.out.println("array [" + i + "][" + j+ "] = " + matrixArray[i][j]);
            }
        }
    }
}
