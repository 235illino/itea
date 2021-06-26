package homework_23_06;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class HashMapPractice {
    /*
    Создать метод который принимает на вход список слов, и возвращает
Мапу где ключ это слово, а значение - длина слова
     */
    public static HashMap<String, Integer> getWordsWithLength(List<String> words) {
        HashMap<String, Integer> result = new HashMap<>();
        for (String word : words) {
            if (word == null) {
                result.put(null, 0);
            } else {
                result.put(word, word.length());
            }
        }
        return result;
    }

    /*
    Создать метод, который возвращает мапу где ключ это слово, а значение
количество повторений

{one, b, three, four, seven, eight, nine, twelve, eleven, one, a, tewntyOne,
seventyFour, one, null}
     */
    public static HashMap<String, Integer> getCountedWords(List<String> words) {
        HashMap<String, Integer> result = new HashMap<>();
        for (String word : words) {
            if (result.containsKey(word)) {
                int i = result.get(word);
                result.put(word, ++i);
            } else if (result.containsKey(null)) {
                int i = result.get(null);
                result.put(null, ++i);
            } else {
                result.put(word, 1);
            }

        }
        return result;
    }

    public static void main(String[] args) {
        List<String> words = Arrays.asList("one", "b", "three", "four", "seven", "eight", "nine", "twelve", "eleven", "one", "a", "tewntyOne",
                "seventyFour", "one", null);
        HashMap<String, Integer> wordsWithLength = getWordsWithLength(words);
        System.out.println(wordsWithLength);

        HashMap<String, Integer> countedWords = getCountedWords(words);
        System.out.println(countedWords);
    }
}
