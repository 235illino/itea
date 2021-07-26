package Class_16;

import java.io.File;
import java.util.Map;

public class App3 {
    public static void main(String[] args) {
        File json = new File("src");
        JsonCreator jsonCreator = new JsonCreator(json);
        DataProvider dataProvider = new DataProvider();

        Map<String, Object> data = dataProvider.getData();
        jsonCreator.jsonCreator(data);
    }
}
