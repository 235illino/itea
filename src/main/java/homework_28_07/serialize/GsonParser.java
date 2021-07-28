package homework_28_07.serialize;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.lang.reflect.Type;
import java.util.Map;


public class GsonParser {

    public void writeOrder(Order order, String fileName) {

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try (FileWriter fileWriter = new FileWriter(fileName)) {
            gson.toJson(order, fileWriter);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


    }

    public void writeMap(Order order, String fileName) {
        Map<Product, Integer> productsPars = Map.copyOf(order.getProducts());
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        Type itemsMapType = new TypeToken<Map<Product, Integer>>() {}.getType();
        try (FileWriter fileWriter = new FileWriter(fileName)) {
            gson.toJson(productsPars, itemsMapType,fileWriter);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


    }


    public Order readOrder(String fileName) {
        try (FileReader fr = new FileReader(fileName)) {

            return new Gson().fromJson(fr, Order.class);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public Map<Product, Integer> readMap(String fileName) {
        try (FileReader fr = new FileReader(fileName)) {
            return new Gson().fromJson(fr, Map.class);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

}
