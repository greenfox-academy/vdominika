import java.util.Arrays;


public class HT2 {
    String [] theArray;
    int arraySize;
    int itemInArray = 0;

    public static void main(String [] args){
    HashFunction theFunc = new HashFunction(30);
    String[] elementsToAdd = {"1","5","17","21","26"};

    theFunc.hashFunction1(elementsToAdd, theFunc.theArray);
    theFunc.displayTheStack();
    }
    public void hashFunction1(String()stringsForArray, String() theArray){
        for (int i = 0; i < stringsForArray.length; i++) {
            String newElementVal = stringsForArray[i];
            theArray[Integer.parseInt (newElementVal)] = newElementVal;
        }
    }

    HashFunction(int size){
        arraySize = size;
        theArray = new String[size];
        Arrays.fill(theArray, "-1");
    }

    public void displayTheStack(){
        int increment = 0;
    }
}
