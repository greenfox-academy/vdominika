public class AppendA {
    public static void main(String[] args) {

        String[] nimals = {"kuty", "macsk", "cic"};

        for(int i = 0; i < nimals.length; i++) {
            nimals[i] += "a";
        }

        for(int i = 0; i < nimals.length; i++) {
            System.out.println(nimals[i]);
        }

    }
}
