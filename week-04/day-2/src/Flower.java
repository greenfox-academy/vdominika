public class Flower extends Garden {
    int yellowFlower;
    int blueFlower;
    int waterFlowers;


    public void need() {
        if (allTheWaters*0.75 < 20) {
            System.out.println ("The yellow flower needs water");
            System.out.println ("The blue flower needs water");
        } else  {
            System.out.println ("The yellow flower does not need water");
            System.out.println ("The blue flower does not need water");
        }

    }
}

