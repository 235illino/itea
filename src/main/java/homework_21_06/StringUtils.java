package homework_21_06;

import java.util.*;

public class StringUtils {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("day", "night", "yes", "no", "horses", "java",
                                            "yellow", "day", "no", "day", "horses", "java");
        System.out.println(StringUtils.getDuplicatesFor(strings));
        System.out.println(StringUtils.getDuplicatesSet(strings));
        System.out.println(StringUtils.getLongestWord(strings));
    }

    public static Set<String> getDuplicatesSet(List<String> words) {
        Set<String> unique = new HashSet<>();
        Set<String> result = new HashSet<>();
        for (int i = 0; i < words.size(); i++) {
            if (!unique.add(words.get(i))) {
                result.add(words.get(i));
            }

        }

        return result;
    }

    public static Set<String> getDuplicatesFor(List<String> words) {
        Set<String> unique = new HashSet<>();
        for (int i = 0; i < words.size(); i++) {
            for (int j = i + 1; j < words.size(); j++) {
                if (words.get(i).equals(words.get(j))) {
                    unique.add(words.get(j));
                }
            }
        }
        return unique;
    }


    public static String getLongestWord(List<String> words) {

        String result = words.get(0);
        for (int j = 1; j < words.size(); j++) {
            if (result.length() < words.get(j).length()) {
                result = words.get(j);
            }
        }
        return result;
    }
}
