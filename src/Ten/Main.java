package Ten;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Path inputFile = Paths.get("alice.txt").toAbsolutePath();

        try {
            List<String> inputStrings = Files.readAllLines(inputFile);

            HashSet<String> set = new HashSet<>();
            HashMap<String, Integer> map = new HashMap<>();

            for(int i = 0; i < inputStrings.size(); i++) {
                String[] words = inputStrings.get(i).split("\\W+");

                for (int j = 0; j < words.length; j++) {
                    set.add(words[j]);
                    Integer current = map.get(words[j]);
                    map.put(words[j], current != null ? current + 1 : 1);
                }
            }

            System.out.println("Number of unique words: " + set.size());
            System.out.println("Unique words count: " + map.toString());

        } catch (Exception err) {
            err.printStackTrace();
        }
    }
}

