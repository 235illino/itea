package Class_16;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DataProvider {
    public Map<String, Object> getData() {
        Map<String, Object> data = new HashMap<>();
        try (Scanner scanner = new Scanner(System.in)) {
            String str = scanner.nextLine();
            while (!"end".equals(str)) {
                String[] pair = str.split("=");
                data.put(getKey(pair), getValue(pair));
                str = scanner.nextLine();
            }
        }
        return data;
    }

    private Object getValue(String[] pair) {
        String value = pair[1];
        try {
           return Integer.parseInt(value.trim());
        } catch (NumberFormatException r) {
            return value;
        }


    }

    private String getKey(String[] pair) {
        return pair[0];
    }
}
