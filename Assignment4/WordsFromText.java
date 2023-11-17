package Assignment4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeSet;

public class WordsFromText {
    public static void main(String[] args){
        TreeSet<String> words = new TreeSet<>();

        try(BufferedReader br = new BufferedReader(new FileReader("wordsforAssignment.text"))){
            String line;
            while ((line = br.readLine()) != null){
                String[] word1 = line.split("\\s+");
                for (String word : word1) {
                    words.add(word);
                }
            }
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("The nonduplicate words in ascending order are: " + words);
    }
}
