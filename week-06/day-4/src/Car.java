
//Create a Car class with 2 enum properties
//enum of car types
//        The types of these cars or vehicles is up to you
//enum of colors
//        Create 256 Vehicles randomly and put them into a List
//        Count and Print the number of same vehicles for each type
//        Count and Print the number of same vehicles for each color
//        Print the most frequently occurring vehicle


import java.util.*;

import static java.awt.Color.BLUE;

public class Car {

    String carType;
    String carColor;

    public Car(int Cartype, int Carcolor) {

        this.carType = Cartype;
        this.carColor = Carcolor.values()[(int)(Math.random()*3)].toString();

    }

    public static void main(String[] args) {
        List<String> carList = new ArrayList<>();
        for (int i = 0; i < 256; i++) {
            carList.get(i);
        }
    }

    public enum Cartype {
        OPEL, MAZDA, TESLA;

            private static final List<Cartype> VALUES =
                    Collections.unmodifiableList(Arrays.asList(values()));
            private static final int SIZE = VALUES.size();
            private static final Random RANDOM = new Random();

            public static Cartype randomCartype()  {
                return VALUES.get(RANDOM.nextInt(SIZE));
            }
        }

    public enum Carcolor {
        GREEN, YELLOW, RED, BLUE;

        private static final List<Carcolor> VALUES =
                Collections.unmodifiableList(Arrays.asList(values()));
        private static final int SIZE = VALUES.size();
        private static final Random RANDOM = new Random();

        public static Carcolor randomCarcolor()  {
            return VALUES.get(RANDOM.nextInt(SIZE));
        }
    }
}
