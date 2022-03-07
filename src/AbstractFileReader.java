import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

public abstract class  AbstractFileReader {
    //Path is a data type which is built into java. Once it is set it will not change
    //for the instance so that it why we've added the keyword final.
    private final Path filePath;

    //Constructor

    protected AbstractFileReader(String filePath) {
        this.filePath = Path.of(filePath);
    }

    public String getFilePath() {
        return filePath.toString();
    }
    //This will read the file and turn the output into a list of strings.
    public List<String> readFile() throws IOException
    {
        return Files.lines(filePath)
                .map(this::parseLine)
                .collect(Collectors.toList());
    }
    protected abstract String parseLine(String line);
}

