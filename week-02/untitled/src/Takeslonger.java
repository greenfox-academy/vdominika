public class Takeslonger {
    public static void main(String... args){
        StringBuilder quote = new StringBuilder ("Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.");

        // When saving this quote a disk error has occured. Please fix it.
        // Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
        // Using pieces of the quote variable (instead of just redefining the string)

//       String[] parts = quote.split("you expect");
//       String part1 = parts[0];
//       String part2 = parts[1];
//
//        System.out.println(part1);
//
//        public StringBuilder part1 () = new StringBuilder ("");


//        StringBuilder quote = new StringBuilder("Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.");
        quote.insert(20," always takes longer than");
        System.out.println(quote);
            }
        }
//    sb.append ("always takes longer than");

