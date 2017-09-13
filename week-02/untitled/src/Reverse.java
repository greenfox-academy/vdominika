public class Reverse {
    public static void main(String... args){
//        String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";


//        public static void main(String args[]){
            String input = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";
            String result="";
            for(int i=input.length()-1;i>=0;i--){
                result=result+input.charAt(i);
            }
            System.out.println(result);
        }

 // Create a function that can reverse a String, which is passed as the parameter
        // Use it on this reversed string to check it!
        // Try to solve this using charAt() first, and optionally anything else after.

//        System.out.println(reversed);
    }

