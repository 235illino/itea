package Class_16;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class JsonCreator {
    private static final String STR = "\"%s\" ";

    private final File json;

    public JsonCreator(File json) {
        this.json = json;
    }

    public void jsonCreator(Map<String, Object> data) {
        try (FileWriter fileWriter = new FileWriter(json)) {

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private String transformToJson(Map<String, Object> data) {
        StringBuilder sb = new StringBuilder("{ ");
        convertToString(data, sb);
        sb.append(" }");
        return sb.toString();
    }

    private void convertToString(Map<String, Object> data, StringBuilder stringBuilder) {
        int counter = data.size();
        for (Map.Entry<String, Object> entry : data.entrySet()) {
            counter--;
            stringBuilder.append(String.format(STR, entry.getKey()))
                    .append(" : ")
                    .append(getValue(entry.getValue()));
            if (counter > 0) {
                stringBuilder.append(", ");
            }
        }

    }

    private String getValue(Object value) {
        if (value instanceof Integer) {
            return String.valueOf(value);
        }
        return String.format(STR, value);
    }
}
