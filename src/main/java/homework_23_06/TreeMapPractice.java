package homework_23_06;

import java.util.*;

/*
Создать метод, который принимает список слов, и возвращает мапу, где
ключ это длина слова, а значение список слов:
- public TreeMap<Integer, List<String>> getLengthWithWords(List<String> words);
- Есть Мапа - {“one”:”один”, “two”: “два” ,”three”:”три”, “four”:”четыре”, “five”:”
пять”} нужно создать метод который меняет местами ключ<->значение у этой
же мапы.
- public void replaceKeyValue(Map<String, String> map);
 */
public class TreeMapPractice {
    public static TreeMap<Integer, List<String>> getLengthWithWords(List<String> words) {
        TreeMap<Integer, List<String>> result = new TreeMap<>();
        for (String word : words) {
            if (word == null) {
                result.put(0, words);
            } else {
                result.put(word.length(), words);
            }
        }
        return result;
    }

    public static void replaceKeyValue(Map<String, String> map) {
        Map<String, String> result = new TreeMap<>();
        for (Map.Entry<String, String> mapReplace : map.entrySet()) {

            result.put(mapReplace.getValue(), mapReplace.getKey());

        }
        map.clear();
        map.putAll(result);


    }

    public static void main(String[] args) {
        List<String> words = Arrays.asList("one", "b", "three", "four", "seven", "eight", "nine", "twelve", "eleven", "one", "a", "tewntyOne",
                "seventyFour", "one", null);
        TreeMap<Integer, List<String>> listTreeMap = getLengthWithWords(words);
        System.out.println(listTreeMap);

        Map<String, String> map = new HashMap<>();
        map.put("one", "один");
        map.put("two", "два");
        map.put("three", "три");
        map.put("four", "четыре");
        map.put("five", "пять");
        replaceKeyValue(map);
        System.out.println(map);
    }
}
