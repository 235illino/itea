package Class_16;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        int countRows = 0;
        int countWords = 0;
        List<Integer> words = new ArrayList<>();
        try (FileInputStream inputStream = new FileInputStream("/home/ilya/Documents/new 1.txt")) {
            int i;

            while ((i = inputStream.read()) != -1) {
                if ((char) i == ' ') {
                    countWords++;
                } else if ((char) i == '\n') {
                    words.add(++countWords);
                    countRows++;
                    countWords = 0;
                }
            }
            System.out.println("total rows amount: " + countRows);
            for (int j = 0; j < words.size(); j++) {
                System.out.println("row # " + (j + 1) + " has " + words.get(j) + " words");

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
