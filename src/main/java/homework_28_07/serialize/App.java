package homework_28_07.serialize;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) throws ParseException {
        Product product = new Product(1, "kiwi", "25", "fruit");
        Product product2 = new Product(2, "banana", "30", "fruit");
        Product product3 = new Product(3, "apple", "45", "fruit");

        Map<Product, Integer> products = new HashMap<>();
        products.put(product, 5);
        products.put(product2, 15);
        products.put(product3, 25);

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String strDate = "2021-07-10";
        Date date = formatter.parse(strDate);


        Order order = new Order(25, products, date);

        GsonParser gsonParser = new GsonParser();
        gsonParser.write(order, "test.json");

        Order parseOrder = gsonParser.read("test.json");

        System.out.println(parseOrder.toString());

    }
}
