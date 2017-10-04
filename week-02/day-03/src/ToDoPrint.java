public class ToDoPrint {
    public static void main(String... args){
        String todoText = " - Buy milk\n";
      
        String todoStart =  "My todo:\n";
        todoText = todoStart.concat (todoText);
        todoText = todoText.concat (" - Download games\n  - Diablo");

        System.out.println(todoText);
    }
}