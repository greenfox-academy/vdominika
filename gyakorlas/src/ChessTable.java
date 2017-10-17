
// Crate a program that draws a chess table like this
//
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %
//

public class ChessTable {

    public static void main(String[] args) {
        for (int i = 0; i < 9; i++) {
            if (i % 2 == 0) {
                System.out.println ("% % % % ");
            } else {
                System.out.println (" % % % % ");
            }
        }
    }
}

