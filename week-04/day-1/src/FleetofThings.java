import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FleetofThings {

    public static void main(String[] args) {
        Fleet fleet = new Fleet();
        // Create a fleet of things to have this output:
        // 1. [ ] Get milk
        // 2. [ ] Remove the obstacles
        // 3. [x] Stand up
        // 4. [x] Eat lunch


        Thing toDo = new Thing("Get milk");
        Thing remove = new Thing ("Remove the obstacles");
        Thing standUp = new Thing ("Stand up");
            standUp.complete ();
        Thing eatLunch = new Thing ("Eat lunch");
            eatLunch.complete ();

//        List<Fleet> fleet = new ArrayList<String> Arrays.asList (toDo, remove, standUp, eatLunch);
        fleet.add (toDo);
        fleet.add (remove);
        fleet.add (standUp);
        fleet.add (eatLunch);

        System.out.println(fleet);
    }
}