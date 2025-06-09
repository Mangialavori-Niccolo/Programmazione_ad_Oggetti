package org.Niccolo.collections;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordFrequency {
    public static List<String> getLines(String filename) throws IOException {
        return Files.readAllLines(Path.of(filename));
    }

    public static List<String> lineToWords(String line) {
        return Arrays.asList(line.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+"));
    }

    public static Map<String, Integer> wordFrequency(String filename) throws IOException {
        Map<String, Integer> result = new HashMap<>();
        for(String line : getLines(filename)){
            List<String> words = lineToWords(line);
            for(String word : words){
                if(result.containsKey(word)){
                    result.replace(word, result.get(word), result.get(word) + 1);
                }
                else {
                    result.put(word, 1);
                }
            }
        }

        return result;
    }
}
