//  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `factorio`
//   that returns it's input's factorial
public class Factorio {
    public static void main(String[] args) {
        int number = 5;
        System.out.println(Factorio(number));
    }
    public static int Factorio (int factorial) {
        int fact = 1;
        for (int i = 1; i <= factorial; i++) {
            fact *= i;
        }
        return fact;
    }




//        int factorial ( int input );
//        {
//            int x, fact = 1;
//            for ( x = input; x > 1; x--)
//            {
//                fact *= x;
//            }
//            return fact;
//        }
//
//    }
    }
