package Class_16;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class App2 {
    public List<String> getAllFiles(File path) {
        List<String> files = new ArrayList<>();
        if (path.exists()) {
            for (File file : path.listFiles()) {
                files.add(file.getAbsolutePath());
            }
        }
        return files;
    }

    public static void main(String[] args) {
        App2 app2 = new App2();
        List<String> allfiles = app2.getAllFiles(new File("src/main/java"));
        allfiles.forEach(s -> System.out.println(s));
    }
}
