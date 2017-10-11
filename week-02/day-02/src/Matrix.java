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

    public static void main(String[] args) {
        String [][] numbers = {
            {"0", "1"}
        };
        System.out.println (numbers[0][1] + numbers [0][0] + numbers[0][0] + numbers[0][0]);
        System.out.println (numbers[0][0] + numbers [0][1] + numbers[0][0] + numbers[0][0]);
        System.out.println (numbers[0][0] + numbers [0][0] + numbers[0][1] + numbers[0][0]);
        System.out.println (numbers[0][0] + numbers [0][0] + numbers[0][0] + numbers[0][1]);
    }
}
