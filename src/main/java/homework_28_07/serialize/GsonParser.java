package homework_28_07.serialize;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;


public class GsonParser {

    public void write(Order order, String fileName) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        try (FileWriter fileWriter = new FileWriter(fileName)) {
            gson.toJson(order, fileWriter);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


    }


    public Order read(String fileName) {
        try(FileReader fr = new FileReader(fileName)) {

            return new Gson().fromJson(fr, Order.class);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

}
