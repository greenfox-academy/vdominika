public class Calc3 {

    public static <T extends Number> Double add(T a, T b) {
        return a.doubleValue() + b.doubleValue();
    }

    public static <T extends Number> Double subtract(T a, T b) {
        return a.doubleValue() - b.doubleValue();
    }

    public static <T extends Number> Double multiply(T a, T b) {
        return a.doubleValue() * b.doubleValue();
    }

    public static <T extends Number> Float divide(T a, T b) {
            return a.floatValue() / b.floatValue();
    }


    public static void main(String[] args) {

        System.out.println(add(3, 4));
        System.out.println(subtract(3, 3));
        System.out.println(multiply(3, 3));
        System.out.println(divide(3, 0));
    }
}
