// Write a function that copies a file to an other
// It should take the filenames as parameters
// It should return a boolean that shows if the copy was successful

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

import static com.sun.deploy.cache.Cache.copyFile;

public class CopyFile {
    public static void main(String[] args) {
        try {
            Path filePath = Paths.get("kiskece.txt");
            List<String> lines = Files.readAllLines(filePath);
            Path filePath2 = Paths.get("felszallott.txt");
            Files.write(filePath2, lines);
        } catch (Exception e) {
            System.out.println("Uh-oh, could not write the file!");
        }
    }
}