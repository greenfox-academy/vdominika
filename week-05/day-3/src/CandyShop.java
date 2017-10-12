import java.util.ArrayList;

public class CandyShop {

    int income;
    int sugarAmount;
    final static String CANDY = "candy";
    final static String LOLLIPOP = "lollipop";

    ArrayList<Dessert> storage = new ArrayList<> ( );

    public CandyShop(int sugarAmountGramms) {
        sugarAmount = sugarAmountGramms;
    }

    public void createSweets(String dessertType) {
        if (dessertType.equals("candy")) {
            storage.add (new Candy ( ));
        } else {
            storage.add (new Lollipop ( ));
        }
        sugarAmount -= storage.get (storage.size ( ) - 1).sugar;
    }
    public void raise(int percentage){
        for (Dessert dessert : storage) {
            dessert.raisePrice (percentage);
        }
    }
    public void sell (String dessertType, int amount){
        if(dessertType.equals("candy")){
            for (int i = 0; i < amount; i++) {
                if (getDessert(dessertType)==null){
                    break;
                }
                storage.remove(getDessert(dessertType));
                income += getDessert(dessertType).price * amount;
            }
            storage.remove();
        }
    }
    private Dessert getDessert(String dessertType){
        for (int i = 0; i < storage.size (); i++) {
            if(storage.get(i) instanceof Lollipop && dessertType.equals("lollipop")){
                return storage.get(i);
            }else if(storage.get(i) instanceof Candy && dessertType.equals("candy"));
        }
        return null;
    }
    public void buySugar(int amount){
        sugarAmount += amount;
        income -= 0.1 * amount;
    }

    @Override
    public String toString() {
        return "Inventory; " + dessertCounter(CANDY) + "candies, " + dessertCounter (LOLLIPOP) + "lollipops, "+ + "Income: " + income +", Sugar: " + sugarAmount;
    }
    private int dessertCounter(String dessertType){
        int counter = 0;
        for (int i = 0; i < storage.size () ; i++) {
            if(storage.get(i) instanceof Lollipop && dessertType.equals("lollipop")){
                counter++;
            }if(storage.get(i) instanceof Candy && dessertType.equals("candy")){
                counter++;
            };
        }return counter;
    }
}


