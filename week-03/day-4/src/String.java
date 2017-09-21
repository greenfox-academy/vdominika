/*// Given a string, compute recursively (no loops) a new string where all the
// lowercase 'x' chars have been changed to 'y' chars.
public class String {
    public static void main(String[] args) {
    String s = "Ebben a szovegben sok az x, de meg tobb az xxxx";
    string1 (s);
    }
    public static String string1(String s){
        if (s.length() == 0){
            return "";
        } else if (s.endWith ("x")) {
            return "y";
        }else
            return string1(s.substring(s.length()-1) + )

    }
}
*/