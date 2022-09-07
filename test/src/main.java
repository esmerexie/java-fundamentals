import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class main {
    String textToAppend = "Happy Learning !!";

    Path path = Paths.get("c:/temp/samplefile.txt");

Files.write(path, textToAppend.getBytes(), StandardOpenOption.APPEND);
}
