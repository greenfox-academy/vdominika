import java.util.*;

public class Matchmaking{
    public static void main(String... args){
        ArrayList<String> girls = new ArrayList<>(Arrays.asList("Eve", "Ashley", "Bözsi", "Kat", "Jane"));
        ArrayList<String> boys = new ArrayList<>(Arrays.asList("Joe", "Fred", "Béla", "Todd", "Neef", "Jeff"));
        ArrayList<String> order = new ArrayList<>();

        // Join the two lists by matching one girl with one boy in the order list
        // Expected output: "Eve", "Joe", "Ashley", "Fred"...

        for (int i = 0; i < girls.size() ; i++) {
            order.add(girls.get(i) + ", " + boys.get(i));
        }

        order.add(boys.get(boys.size()-1));

        System.out.println(order);
    }
}