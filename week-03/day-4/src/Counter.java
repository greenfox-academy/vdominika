public class Counter {
    public static void main(String[] args) {
        countingBack(5);
    }

    private static void countingBack(int number) {
        if (number == 0) {
            System.out.println(number);
        } else {
            System.out.println(number);
            countingBack(number - 1);
        }
    }
}