import java.util.*;

public class CandyShop{
    public static void main(String... args){
        ArrayList<Object> arrayList = new ArrayList<Object>();
        arrayList.add("Cupcake");
        arrayList.add(2);
        arrayList.add("Brownie");
        arrayList.add(false);

        arrayList.remove(1);
        arrayList.add(1,"Croissant");
        arrayList.remove(3);
        arrayList.add(3, "Ice Cream");

        System.out.println(arrayList);
    }
}

