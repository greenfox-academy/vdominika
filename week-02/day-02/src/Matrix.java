// - Create (dynamically) a two dimensional array
//   with the following matrix. Use a loop!
//
//   1 0 0 0
//   0 1 0 0
//   0 0 1 0
//   0 0 0 1
//
// - Print this two dimensional array to the output

public class Matrix {

    //    public static void main(String[] args) {
//        String [][] numbers = {
//            {"0", "1"}
//        };
//        System.out.println (numbers[0][1] + numbers [0][0] + numbers[0][0] + numbers[0][0]);
//        System.out.println (numbers[0][0] + numbers [0][1] + numbers[0][0] + numbers[0][0]);
//        System.out.println (numbers[0][0] + numbers [0][0] + numbers[0][1] + numbers[0][0]);
//        System.out.println (numbers[0][0] + numbers [0][0] + numbers[0][0] + numbers[0][1]);
//    }

// OR, as per the task asks:

    public static void main(String[] args) {
        int[][] matrix = new int[4][4];

        matrixCreator ( matrix);
    }

    public static void matrixCreator (int [][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length ; j++) {
                if (i == j){
                    matrix [i][j] = 1;
                }else {
                    matrix [i][j] = 0;
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length ; j++) {
                System.out.print (matrix[i][j] + " " );
            }
            System.out.println (" " );
        }
    }
}