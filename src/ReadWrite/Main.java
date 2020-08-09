package ReadWrite;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Path inputFile = Paths.get("input.txt").toAbsolutePath();
        Path outputFile = Paths.get("output.txt").toAbsolutePath();

        try {
            List<String> inputStrings = Files.readAllLines(inputFile);

            Files.write(outputFile, inputStrings);

            System.out.print(new String(Files.readAllBytes(outputFile)) + "Written to output.txt");

        } catch (Exception err) {
            err.printStackTrace();
        }
    }
}