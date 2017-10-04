public class TakesLonger {
    public static void main(String... args){
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

        StringBuilder sb = new StringBuilder ("Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.");
        sb.insert (21, "always takes longer than");

        System.out.println (sb );
        // When saving this quote a disk error has occured. Please fix it.
        // Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
        // Using pieces of the quote variable (instead of just redefining the string)

//        System.out.println(quote.split ("It", "you"));
    }
}
