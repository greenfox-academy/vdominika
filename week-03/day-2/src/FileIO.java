/*import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class FileIO {
    public static void main(String[] args){
        Path myPath  = Paths.get(first:"Oracle.txt");
        List<String> lines = Files.readAllLines(myPath);
        List<String> newList = new ArrayList<>();
        newList.add("HELLO ALL");
        try{
            Files.write(myPath, newList, StandardOpenOption);
        }
    }
    catch(IOException e){
        System.out.println("There is a problem with your file");
        e.printStackTrace();
    }
    foreach (String line: lines){
        System.out.println(line);
}
}*/