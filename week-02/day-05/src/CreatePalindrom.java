public class CreatePalindrom {

    public static void main(String[] args) {

        String word = "This String will be getting reversed";
        String reversedWord="";

        for(int i=word.length()-1;i>=0;i--){
            reversedWord = reversedWord + word.charAt(i);
        }

        System.out.println(" Reversed Word : "+reversedWord);
    }

}

    
