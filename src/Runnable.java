import java.io.IOException;
public class Runnable {
    public static void main(String[] args) throws IOException{
        DigitsOnlyFileReader digitsOnlyFileReader = new DigitsOnlyFileReader("Student.txt");

        System.out.println(digitsOnlyFileReader.readFile());
        System.out.println(digitsOnlyFileReader.getFilePath());
    }
}
