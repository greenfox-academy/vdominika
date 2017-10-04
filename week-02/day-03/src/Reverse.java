
import java.lang.*;
import java.io.*;
import java.util.*;

// Class of ReverseString
        public class Reverse {
    public static void main(String[] args) {
        String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

        char[] try1 = reversed.toCharArray ( );

        for (int i = try1.length - 1; i >= 0; i--)
            System.out.print (try1[i]);
    }
}
